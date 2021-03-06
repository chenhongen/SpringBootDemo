package com.che.websocket;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.messaging.converter.MappingJackson2MessageConverter;
import org.springframework.messaging.converter.StringMessageConverter;
import org.springframework.messaging.simp.stomp.StompCommand;
import org.springframework.messaging.simp.stomp.StompHeaders;
import org.springframework.messaging.simp.stomp.StompSession;
import org.springframework.messaging.simp.stomp.StompSessionHandlerAdapter;
import org.springframework.scheduling.concurrent.ThreadPoolTaskScheduler;
import org.springframework.stereotype.Service;
import org.springframework.web.socket.WebSocketHttpHeaders;
import org.springframework.web.socket.client.WebSocketClient;
import org.springframework.web.socket.client.standard.StandardWebSocketClient;
import org.springframework.web.socket.messaging.WebSocketStompClient;
import org.springframework.web.socket.sockjs.client.SockJsClient;
import org.springframework.web.socket.sockjs.client.WebSocketTransport;

import com.che.pojo.vo.MessageVO;

/**
 * deprecated
 * @author che
 *
 */
@Service
public class WebSocketService {
	private static final Logger logger = LoggerFactory.getLogger(WebSocketService.class);
	
    @Value("${socket.url}")
    private String socketUrl;

    private SockJsClient sockJsClient;
    private WebSocketClient webSocketClient;

    private WebSocketStompClient stompClient;

    private final WebSocketHttpHeaders headers = new WebSocketHttpHeaders();

    private WebSocketSessionHandler stompSessionHandler;
    private static final ThreadPoolTaskScheduler taskScheduler = new ThreadPoolTaskScheduler();

    // 连接建立时机：某IP第一次访问系统 且 上次退出
    //@PostConstruct
    public void init() {
        taskScheduler.afterPropertiesSet();
        ///List<Transport> transports = new ArrayList<>();
        ///transports.add(new WebSocketTransport(new StandardWebSocketClient()));
        ///this.sockJsClient = new SockJsClient(transports);

        ///this.stompClient = new WebSocketStompClient(sockJsClient);
        ///this.stompClient.setMessageConverter(new MappingJackson2MessageConverter());
        //sockJsClient.setConnectTimeoutScheduler(taskScheduler);
        this.webSocketClient = new StandardWebSocketClient();
		this.stompClient = new WebSocketStompClient(webSocketClient);
		this.stompClient.setMessageConverter(new StringMessageConverter());
		//this.stompClient.setTaskScheduler(taskScheduler); // for heartbeats
        
        connect();
		
    }

    public void connect() {

        final CountDownLatch latch = new CountDownLatch(1);
        final AtomicReference<Throwable> failure = new AtomicReference<>();

        stompSessionHandler = new WebSocketSessionHandler(failure) {

            @Override
            public void afterConnected(final StompSession session, StompHeaders connectedHeaders) {

                super.afterConnected(session, connectedHeaders);
                /*session.subscribe(String.format("/topic/schema/33"), new StompFrameHandler() {
                    @Override
                    public Type getPayloadType(StompHeaders headers) {
                        return SocketMessage.class;
                    }

                    @Override
                    public void handleFrame(StompHeaders headers, Object payload) {
                        SocketMessage socketMessage = (SocketMessage) payload;
                        try {
                            //assertEquals("Hello, Spring!", greeting.getMessage());
                            System.out.println("socket message back: "+ socketMessage.getMessage());
                        } catch (Throwable t) {
                            failure.set(t);
                        } finally {
                            session.disconnect();
                            latch.countDown();
                        }
                    }
                });*/
                //send("state", 8L, new SocketMessage("connected", "hello"));
                System.out.println("----------------");
            }
        };

        //stompClient.setTaskScheduler(taskScheduler);
        stompClient.setDefaultHeartbeat(new long[] { 28, 28 });
        stompClient.setMessageConverter(new MappingJackson2MessageConverter());
        //taskScheduler.scheduleAtFixedRate(stompSessionHandler, 15000);

    }

    public void send(String type, String id, MessageVO message){
        if (stompSessionHandler != null){
            stompSessionHandler.send(type, id, message);
        }
    }

    private class WebSocketSessionHandler extends StompSessionHandlerAdapter implements Runnable {

        private final AtomicReference<Throwable> failure;
        private StompSession session;
        private volatile boolean connected = false;


        public WebSocketSessionHandler(AtomicReference<Throwable> failure) {
            this.failure = failure;
        }

        @Override
        public void handleFrame(StompHeaders headers, Object payload) {
            logger.error("WebSocket STOMP ERROR frame: " + headers.toString());
            this.failure.set(new Exception(headers.toString()));
        }

        @Override
        public void handleException(StompSession s, StompCommand c, StompHeaders h, byte[] p, Throwable ex) {
            logger.error("WebSocket handler exception", ex);
            this.failure.set(ex);
            connected = false;
        }

        @Override
        public void handleTransportError(StompSession session, Throwable ex) {
            logger.error("WebSocket Transport failure", ex);
            this.failure.set(ex);
            connected = false;
        }

        @Override
        public void afterConnected(final StompSession session,
                                   StompHeaders connectedHeaders){
            connected = true;
            this.session = session;
        }

        public void send(String type, String id, MessageVO message){
            if (connected) {
                session.send(String.format("/ws/%s/%s",type, id), message.getVinCode());
            }
        }

        @Override
        public void run() {
            if (!connected) {
                logger.info("WebSocket connecting...");
                //stompClient.connect( "{host}/ewf-web-socket", headers, this, socketUrl);
                stompClient.connect("ws://127.0.0.1:8081/ws", this);
            } else {
                //logger.info("WebSocket already connected");
            }
        }
    }
}