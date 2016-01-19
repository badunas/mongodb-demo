package com.badun.mongodbdemo.data.entity;

import org.springframework.data.annotation.Id;

import java.util.Date;

/**
 * Created by Artsiom Badun.
 */

public class UserAction {

    @Id
    private String actionId;
    private Date timestamp;
    private String userId;
    private String ip;
    private String url;

    public String getActionId() {
        return actionId;
    }

    public void setActionId(String actionId) {
        this.actionId = actionId;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
