package com.lmj.server.bean;

import java.math.BigDecimal;
import java.util.Date;

public class User {
    private Integer id;

    private String userName;

    private String email;

    private String pass;

    private String passwd;

    private Integer t;
    private Integer class1;
    private Integer switch1;

	private Long u;

    private Long d;

    private String plan;

    private Long transferEnable;

    private Integer port;

    private Byte enable;

    private Byte type;

    private Integer lastGetGiftTime;

    private Integer lastCheckInTime;

    private Integer lastRestPassTime;

    private Date regDate;

    private Integer inviteNum;

    private BigDecimal money;

    private Integer refBy;

    private Integer expireTime;

    private String method;

    private Byte isEmailVerify;

    private String regIp;

    private BigDecimal nodeSpeedlimit;

    private Integer nodeConnector;

    private Integer isAdmin;

    private Integer imType;

    private Long lastDayT;

    private Integer senddailymail;

    private Date classExpire;

    private Date expireIn;

    private Integer gaEnable;

    private Integer nodeGroup;

    private Integer autoResetDay;

    private BigDecimal autoResetBandwidth;

    private String protocol;

    private String protocolParam;

    private String obfs;

    private String obfsParam;

    private Integer isHide;

    private Integer isMultiUser;

    private Long telegramId;

    private Long discord;
    public Integer getClass1() {
		return class1;
	}

	public void setClass1(Integer class1) {
		this.class1 = class1;
	}

	public Integer getSwitch1() {
		return switch1;
	}

	public void setSwitch1(Integer switch1) {
		this.switch1 = switch1;
	}
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass == null ? null : pass.trim();
    }

    public String getPasswd() {
        return passwd;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd == null ? null : passwd.trim();
    }

    public Integer getT() {
        return t;
    }

    public void setT(Integer t) {
        this.t = t;
    }

    public Long getU() {
        return u;
    }

    public void setU(Long u) {
        this.u = u;
    }

    public Long getD() {
        return d;
    }

    public void setD(Long d) {
        this.d = d;
    }

    public String getPlan() {
        return plan;
    }

    public void setPlan(String plan) {
        this.plan = plan == null ? null : plan.trim();
    }

    public Long getTransferEnable() {
        return transferEnable;
    }

    public void setTransferEnable(Long transferEnable) {
        this.transferEnable = transferEnable;
    }

    public Integer getPort() {
        return port;
    }

    public void setPort(Integer port) {
        this.port = port;
    }


    public Byte getEnable() {
        return enable;
    }

    public void setEnable(Byte enable) {
        this.enable = enable;
    }

    public Byte getType() {
        return type;
    }

    public void setType(Byte type) {
        this.type = type;
    }

    public Integer getLastGetGiftTime() {
        return lastGetGiftTime;
    }

    public void setLastGetGiftTime(Integer lastGetGiftTime) {
        this.lastGetGiftTime = lastGetGiftTime;
    }

    public Integer getLastCheckInTime() {
        return lastCheckInTime;
    }

    public void setLastCheckInTime(Integer lastCheckInTime) {
        this.lastCheckInTime = lastCheckInTime;
    }

    public Integer getLastRestPassTime() {
        return lastRestPassTime;
    }

    public void setLastRestPassTime(Integer lastRestPassTime) {
        this.lastRestPassTime = lastRestPassTime;
    }

    public Date getRegDate() {
        return regDate;
    }

    public void setRegDate(Date regDate) {
        this.regDate = regDate;
    }

    public Integer getInviteNum() {
        return inviteNum;
    }

    public void setInviteNum(Integer inviteNum) {
        this.inviteNum = inviteNum;
    }

    public BigDecimal getMoney() {
        return money;
    }

    public void setMoney(BigDecimal money) {
        this.money = money;
    }

    public Integer getRefBy() {
        return refBy;
    }

    public void setRefBy(Integer refBy) {
        this.refBy = refBy;
    }

    public Integer getExpireTime() {
        return expireTime;
    }

    public void setExpireTime(Integer expireTime) {
        this.expireTime = expireTime;
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method == null ? null : method.trim();
    }

    public Byte getIsEmailVerify() {
        return isEmailVerify;
    }

    public void setIsEmailVerify(Byte isEmailVerify) {
        this.isEmailVerify = isEmailVerify;
    }

    public String getRegIp() {
        return regIp;
    }

    public void setRegIp(String regIp) {
        this.regIp = regIp == null ? null : regIp.trim();
    }

    public BigDecimal getNodeSpeedlimit() {
        return nodeSpeedlimit;
    }

    public void setNodeSpeedlimit(BigDecimal nodeSpeedlimit) {
        this.nodeSpeedlimit = nodeSpeedlimit;
    }

    public Integer getNodeConnector() {
        return nodeConnector;
    }

    public void setNodeConnector(Integer nodeConnector) {
        this.nodeConnector = nodeConnector;
    }

    public Integer getIsAdmin() {
        return isAdmin;
    }

    public void setIsAdmin(Integer isAdmin) {
        this.isAdmin = isAdmin;
    }

    public Integer getImType() {
        return imType;
    }

    public void setImType(Integer imType) {
        this.imType = imType;
    }

    public Long getLastDayT() {
        return lastDayT;
    }

    public void setLastDayT(Long lastDayT) {
        this.lastDayT = lastDayT;
    }

    public Integer getSenddailymail() {
        return senddailymail;
    }

    public void setSenddailymail(Integer senddailymail) {
        this.senddailymail = senddailymail;
    }

    public Date getClassExpire() {
        return classExpire;
    }

    public void setClassExpire(Date classExpire) {
        this.classExpire = classExpire;
    }

    public Date getExpireIn() {
        return expireIn;
    }

    public void setExpireIn(Date expireIn) {
        this.expireIn = expireIn;
    }

    public Integer getGaEnable() {
        return gaEnable;
    }

    public void setGaEnable(Integer gaEnable) {
        this.gaEnable = gaEnable;
    }

    public Integer getNodeGroup() {
        return nodeGroup;
    }

    public void setNodeGroup(Integer nodeGroup) {
        this.nodeGroup = nodeGroup;
    }

    public Integer getAutoResetDay() {
        return autoResetDay;
    }

    public void setAutoResetDay(Integer autoResetDay) {
        this.autoResetDay = autoResetDay;
    }

    public BigDecimal getAutoResetBandwidth() {
        return autoResetBandwidth;
    }

    public void setAutoResetBandwidth(BigDecimal autoResetBandwidth) {
        this.autoResetBandwidth = autoResetBandwidth;
    }

    public String getProtocol() {
        return protocol;
    }

    public void setProtocol(String protocol) {
        this.protocol = protocol == null ? null : protocol.trim();
    }

    public String getProtocolParam() {
        return protocolParam;
    }

    public void setProtocolParam(String protocolParam) {
        this.protocolParam = protocolParam == null ? null : protocolParam.trim();
    }

    public String getObfs() {
        return obfs;
    }

    public void setObfs(String obfs) {
        this.obfs = obfs == null ? null : obfs.trim();
    }

    public String getObfsParam() {
        return obfsParam;
    }

    public void setObfsParam(String obfsParam) {
        this.obfsParam = obfsParam == null ? null : obfsParam.trim();
    }

    public Integer getIsHide() {
        return isHide;
    }

    public void setIsHide(Integer isHide) {
        this.isHide = isHide;
    }

    public Integer getIsMultiUser() {
        return isMultiUser;
    }

    public void setIsMultiUser(Integer isMultiUser) {
        this.isMultiUser = isMultiUser;
    }

    public Long getTelegramId() {
        return telegramId;
    }

    public void setTelegramId(Long telegramId) {
        this.telegramId = telegramId;
    }

    public Long getDiscord() {
        return discord;
    }

    public void setDiscord(Long discord) {
        this.discord = discord;
    }
}