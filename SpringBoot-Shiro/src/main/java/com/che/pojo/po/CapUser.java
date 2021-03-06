package com.che.pojo.po;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class CapUser implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column CAP_USER.OPERATOR_ID
     *
     * @mbg.generated
     */
    private BigDecimal operatorId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column CAP_USER.USER_ID
     *
     * @mbg.generated
     */
    private String userId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column CAP_USER.PASSWORD
     *
     * @mbg.generated
     */
    private String password;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column CAP_USER.INVALDATE
     *
     * @mbg.generated
     */
    private Date invaldate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column CAP_USER.USER_NAME
     *
     * @mbg.generated
     */
    private String userName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column CAP_USER.AUTHMODE
     *
     * @mbg.generated
     */
    private String authmode;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column CAP_USER.STATUS
     *
     * @mbg.generated
     */
    private String status;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column CAP_USER.UNLOCKTIME
     *
     * @mbg.generated
     */
    private Date unlocktime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column CAP_USER.MENUTYPE
     *
     * @mbg.generated
     */
    private String menutype;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column CAP_USER.LASTLOGIN
     *
     * @mbg.generated
     */
    private Date lastlogin;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column CAP_USER.ERRCOUNT
     *
     * @mbg.generated
     */
    private BigDecimal errcount;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column CAP_USER.STARTDATE
     *
     * @mbg.generated
     */
    private Date startdate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column CAP_USER.ENDDATE
     *
     * @mbg.generated
     */
    private Date enddate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column CAP_USER.VALIDTIME
     *
     * @mbg.generated
     */
    private String validtime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column CAP_USER.MACCODE
     *
     * @mbg.generated
     */
    private String maccode;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column CAP_USER.IPADDRESS
     *
     * @mbg.generated
     */
    private String ipaddress;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column CAP_USER.EMAIL
     *
     * @mbg.generated
     */
    private String email;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column CAP_USER.CREATEUSER
     *
     * @mbg.generated
     */
    private String createuser;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column CAP_USER.CREATETIME
     *
     * @mbg.generated
     */
    private Date createtime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table CAP_USER
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CAP_USER
     *
     * @mbg.generated
     */
    public CapUser(BigDecimal operatorId, String userId, String password, Date invaldate, String userName, String authmode, String status, Date unlocktime, String menutype, Date lastlogin, BigDecimal errcount, Date startdate, Date enddate, String validtime, String maccode, String ipaddress, String email, String createuser, Date createtime) {
        this.operatorId = operatorId;
        this.userId = userId;
        this.password = password;
        this.invaldate = invaldate;
        this.userName = userName;
        this.authmode = authmode;
        this.status = status;
        this.unlocktime = unlocktime;
        this.menutype = menutype;
        this.lastlogin = lastlogin;
        this.errcount = errcount;
        this.startdate = startdate;
        this.enddate = enddate;
        this.validtime = validtime;
        this.maccode = maccode;
        this.ipaddress = ipaddress;
        this.email = email;
        this.createuser = createuser;
        this.createtime = createtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CAP_USER
     *
     * @mbg.generated
     */
    public CapUser() {
        super();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column CAP_USER.OPERATOR_ID
     *
     * @return the value of CAP_USER.OPERATOR_ID
     *
     * @mbg.generated
     */
    public BigDecimal getOperatorId() {
        return operatorId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column CAP_USER.OPERATOR_ID
     *
     * @param operatorId the value for CAP_USER.OPERATOR_ID
     *
     * @mbg.generated
     */
    public void setOperatorId(BigDecimal operatorId) {
        this.operatorId = operatorId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column CAP_USER.USER_ID
     *
     * @return the value of CAP_USER.USER_ID
     *
     * @mbg.generated
     */
    public String getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column CAP_USER.USER_ID
     *
     * @param userId the value for CAP_USER.USER_ID
     *
     * @mbg.generated
     */
    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column CAP_USER.PASSWORD
     *
     * @return the value of CAP_USER.PASSWORD
     *
     * @mbg.generated
     */
    public String getPassword() {
        return password;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column CAP_USER.PASSWORD
     *
     * @param password the value for CAP_USER.PASSWORD
     *
     * @mbg.generated
     */
    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column CAP_USER.INVALDATE
     *
     * @return the value of CAP_USER.INVALDATE
     *
     * @mbg.generated
     */
    public Date getInvaldate() {
        return invaldate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column CAP_USER.INVALDATE
     *
     * @param invaldate the value for CAP_USER.INVALDATE
     *
     * @mbg.generated
     */
    public void setInvaldate(Date invaldate) {
        this.invaldate = invaldate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column CAP_USER.USER_NAME
     *
     * @return the value of CAP_USER.USER_NAME
     *
     * @mbg.generated
     */
    public String getUserName() {
        return userName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column CAP_USER.USER_NAME
     *
     * @param userName the value for CAP_USER.USER_NAME
     *
     * @mbg.generated
     */
    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column CAP_USER.AUTHMODE
     *
     * @return the value of CAP_USER.AUTHMODE
     *
     * @mbg.generated
     */
    public String getAuthmode() {
        return authmode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column CAP_USER.AUTHMODE
     *
     * @param authmode the value for CAP_USER.AUTHMODE
     *
     * @mbg.generated
     */
    public void setAuthmode(String authmode) {
        this.authmode = authmode == null ? null : authmode.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column CAP_USER.STATUS
     *
     * @return the value of CAP_USER.STATUS
     *
     * @mbg.generated
     */
    public String getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column CAP_USER.STATUS
     *
     * @param status the value for CAP_USER.STATUS
     *
     * @mbg.generated
     */
    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column CAP_USER.UNLOCKTIME
     *
     * @return the value of CAP_USER.UNLOCKTIME
     *
     * @mbg.generated
     */
    public Date getUnlocktime() {
        return unlocktime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column CAP_USER.UNLOCKTIME
     *
     * @param unlocktime the value for CAP_USER.UNLOCKTIME
     *
     * @mbg.generated
     */
    public void setUnlocktime(Date unlocktime) {
        this.unlocktime = unlocktime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column CAP_USER.MENUTYPE
     *
     * @return the value of CAP_USER.MENUTYPE
     *
     * @mbg.generated
     */
    public String getMenutype() {
        return menutype;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column CAP_USER.MENUTYPE
     *
     * @param menutype the value for CAP_USER.MENUTYPE
     *
     * @mbg.generated
     */
    public void setMenutype(String menutype) {
        this.menutype = menutype == null ? null : menutype.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column CAP_USER.LASTLOGIN
     *
     * @return the value of CAP_USER.LASTLOGIN
     *
     * @mbg.generated
     */
    public Date getLastlogin() {
        return lastlogin;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column CAP_USER.LASTLOGIN
     *
     * @param lastlogin the value for CAP_USER.LASTLOGIN
     *
     * @mbg.generated
     */
    public void setLastlogin(Date lastlogin) {
        this.lastlogin = lastlogin;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column CAP_USER.ERRCOUNT
     *
     * @return the value of CAP_USER.ERRCOUNT
     *
     * @mbg.generated
     */
    public BigDecimal getErrcount() {
        return errcount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column CAP_USER.ERRCOUNT
     *
     * @param errcount the value for CAP_USER.ERRCOUNT
     *
     * @mbg.generated
     */
    public void setErrcount(BigDecimal errcount) {
        this.errcount = errcount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column CAP_USER.STARTDATE
     *
     * @return the value of CAP_USER.STARTDATE
     *
     * @mbg.generated
     */
    public Date getStartdate() {
        return startdate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column CAP_USER.STARTDATE
     *
     * @param startdate the value for CAP_USER.STARTDATE
     *
     * @mbg.generated
     */
    public void setStartdate(Date startdate) {
        this.startdate = startdate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column CAP_USER.ENDDATE
     *
     * @return the value of CAP_USER.ENDDATE
     *
     * @mbg.generated
     */
    public Date getEnddate() {
        return enddate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column CAP_USER.ENDDATE
     *
     * @param enddate the value for CAP_USER.ENDDATE
     *
     * @mbg.generated
     */
    public void setEnddate(Date enddate) {
        this.enddate = enddate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column CAP_USER.VALIDTIME
     *
     * @return the value of CAP_USER.VALIDTIME
     *
     * @mbg.generated
     */
    public String getValidtime() {
        return validtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column CAP_USER.VALIDTIME
     *
     * @param validtime the value for CAP_USER.VALIDTIME
     *
     * @mbg.generated
     */
    public void setValidtime(String validtime) {
        this.validtime = validtime == null ? null : validtime.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column CAP_USER.MACCODE
     *
     * @return the value of CAP_USER.MACCODE
     *
     * @mbg.generated
     */
    public String getMaccode() {
        return maccode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column CAP_USER.MACCODE
     *
     * @param maccode the value for CAP_USER.MACCODE
     *
     * @mbg.generated
     */
    public void setMaccode(String maccode) {
        this.maccode = maccode == null ? null : maccode.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column CAP_USER.IPADDRESS
     *
     * @return the value of CAP_USER.IPADDRESS
     *
     * @mbg.generated
     */
    public String getIpaddress() {
        return ipaddress;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column CAP_USER.IPADDRESS
     *
     * @param ipaddress the value for CAP_USER.IPADDRESS
     *
     * @mbg.generated
     */
    public void setIpaddress(String ipaddress) {
        this.ipaddress = ipaddress == null ? null : ipaddress.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column CAP_USER.EMAIL
     *
     * @return the value of CAP_USER.EMAIL
     *
     * @mbg.generated
     */
    public String getEmail() {
        return email;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column CAP_USER.EMAIL
     *
     * @param email the value for CAP_USER.EMAIL
     *
     * @mbg.generated
     */
    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column CAP_USER.CREATEUSER
     *
     * @return the value of CAP_USER.CREATEUSER
     *
     * @mbg.generated
     */
    public String getCreateuser() {
        return createuser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column CAP_USER.CREATEUSER
     *
     * @param createuser the value for CAP_USER.CREATEUSER
     *
     * @mbg.generated
     */
    public void setCreateuser(String createuser) {
        this.createuser = createuser == null ? null : createuser.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column CAP_USER.CREATETIME
     *
     * @return the value of CAP_USER.CREATETIME
     *
     * @mbg.generated
     */
    public Date getCreatetime() {
        return createtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column CAP_USER.CREATETIME
     *
     * @param createtime the value for CAP_USER.CREATETIME
     *
     * @mbg.generated
     */
    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CAP_USER
     *
     * @mbg.generated
     */
    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        CapUser other = (CapUser) that;
        return (this.getOperatorId() == null ? other.getOperatorId() == null : this.getOperatorId().equals(other.getOperatorId()))
            && (this.getUserId() == null ? other.getUserId() == null : this.getUserId().equals(other.getUserId()))
            && (this.getPassword() == null ? other.getPassword() == null : this.getPassword().equals(other.getPassword()))
            && (this.getInvaldate() == null ? other.getInvaldate() == null : this.getInvaldate().equals(other.getInvaldate()))
            && (this.getUserName() == null ? other.getUserName() == null : this.getUserName().equals(other.getUserName()))
            && (this.getAuthmode() == null ? other.getAuthmode() == null : this.getAuthmode().equals(other.getAuthmode()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getUnlocktime() == null ? other.getUnlocktime() == null : this.getUnlocktime().equals(other.getUnlocktime()))
            && (this.getMenutype() == null ? other.getMenutype() == null : this.getMenutype().equals(other.getMenutype()))
            && (this.getLastlogin() == null ? other.getLastlogin() == null : this.getLastlogin().equals(other.getLastlogin()))
            && (this.getErrcount() == null ? other.getErrcount() == null : this.getErrcount().equals(other.getErrcount()))
            && (this.getStartdate() == null ? other.getStartdate() == null : this.getStartdate().equals(other.getStartdate()))
            && (this.getEnddate() == null ? other.getEnddate() == null : this.getEnddate().equals(other.getEnddate()))
            && (this.getValidtime() == null ? other.getValidtime() == null : this.getValidtime().equals(other.getValidtime()))
            && (this.getMaccode() == null ? other.getMaccode() == null : this.getMaccode().equals(other.getMaccode()))
            && (this.getIpaddress() == null ? other.getIpaddress() == null : this.getIpaddress().equals(other.getIpaddress()))
            && (this.getEmail() == null ? other.getEmail() == null : this.getEmail().equals(other.getEmail()))
            && (this.getCreateuser() == null ? other.getCreateuser() == null : this.getCreateuser().equals(other.getCreateuser()))
            && (this.getCreatetime() == null ? other.getCreatetime() == null : this.getCreatetime().equals(other.getCreatetime()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CAP_USER
     *
     * @mbg.generated
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getOperatorId() == null) ? 0 : getOperatorId().hashCode());
        result = prime * result + ((getUserId() == null) ? 0 : getUserId().hashCode());
        result = prime * result + ((getPassword() == null) ? 0 : getPassword().hashCode());
        result = prime * result + ((getInvaldate() == null) ? 0 : getInvaldate().hashCode());
        result = prime * result + ((getUserName() == null) ? 0 : getUserName().hashCode());
        result = prime * result + ((getAuthmode() == null) ? 0 : getAuthmode().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getUnlocktime() == null) ? 0 : getUnlocktime().hashCode());
        result = prime * result + ((getMenutype() == null) ? 0 : getMenutype().hashCode());
        result = prime * result + ((getLastlogin() == null) ? 0 : getLastlogin().hashCode());
        result = prime * result + ((getErrcount() == null) ? 0 : getErrcount().hashCode());
        result = prime * result + ((getStartdate() == null) ? 0 : getStartdate().hashCode());
        result = prime * result + ((getEnddate() == null) ? 0 : getEnddate().hashCode());
        result = prime * result + ((getValidtime() == null) ? 0 : getValidtime().hashCode());
        result = prime * result + ((getMaccode() == null) ? 0 : getMaccode().hashCode());
        result = prime * result + ((getIpaddress() == null) ? 0 : getIpaddress().hashCode());
        result = prime * result + ((getEmail() == null) ? 0 : getEmail().hashCode());
        result = prime * result + ((getCreateuser() == null) ? 0 : getCreateuser().hashCode());
        result = prime * result + ((getCreatetime() == null) ? 0 : getCreatetime().hashCode());
        return result;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CAP_USER
     *
     * @mbg.generated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", operatorId=").append(operatorId);
        sb.append(", userId=").append(userId);
        sb.append(", password=").append(password);
        sb.append(", invaldate=").append(invaldate);
        sb.append(", userName=").append(userName);
        sb.append(", authmode=").append(authmode);
        sb.append(", status=").append(status);
        sb.append(", unlocktime=").append(unlocktime);
        sb.append(", menutype=").append(menutype);
        sb.append(", lastlogin=").append(lastlogin);
        sb.append(", errcount=").append(errcount);
        sb.append(", startdate=").append(startdate);
        sb.append(", enddate=").append(enddate);
        sb.append(", validtime=").append(validtime);
        sb.append(", maccode=").append(maccode);
        sb.append(", ipaddress=").append(ipaddress);
        sb.append(", email=").append(email);
        sb.append(", createuser=").append(createuser);
        sb.append(", createtime=").append(createtime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}