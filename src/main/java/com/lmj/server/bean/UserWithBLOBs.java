package com.lmj.server.bean;

public class UserWithBLOBs extends User {
    private String imValue;

    private String theme;

    private String gaToken;

    private String pac;

    private String remark;

    private String forbiddenIp;

    private String forbiddenPort;

    private String disconnectIp;

    public String getImValue() {
        return imValue;
    }

    public void setImValue(String imValue) {
        this.imValue = imValue == null ? null : imValue.trim();
    }

    public String getTheme() {
        return theme;
    }

    public void setTheme(String theme) {
        this.theme = theme == null ? null : theme.trim();
    }

    public String getGaToken() {
        return gaToken;
    }

    public void setGaToken(String gaToken) {
        this.gaToken = gaToken == null ? null : gaToken.trim();
    }

    public String getPac() {
        return pac;
    }

    public void setPac(String pac) {
        this.pac = pac == null ? null : pac.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public String getForbiddenIp() {
        return forbiddenIp;
    }

    public void setForbiddenIp(String forbiddenIp) {
        this.forbiddenIp = forbiddenIp == null ? null : forbiddenIp.trim();
    }

    public String getForbiddenPort() {
        return forbiddenPort;
    }

    public void setForbiddenPort(String forbiddenPort) {
        this.forbiddenPort = forbiddenPort == null ? null : forbiddenPort.trim();
    }

    public String getDisconnectIp() {
        return disconnectIp;
    }

    public void setDisconnectIp(String disconnectIp) {
        this.disconnectIp = disconnectIp == null ? null : disconnectIp.trim();
    }
}