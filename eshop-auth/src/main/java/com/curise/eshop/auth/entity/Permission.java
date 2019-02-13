package com.curise.eshop.auth.entity;

import lombok.Data;

import java.util.Date;

/**
 * 〈权限实体〉
 *
 * @author Curise
 * @create 2018/12/13
 * @since 1.0.0
 */
//@Data
public class Permission {

    private int id;
    private String zuulPrefix;
    private String servicePrefix;
    private String method;
    private String uri;
    private Date createTime;
    private Date updateTime;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getZuulPrefix() {
        return zuulPrefix;
    }

    public void setZuulPrefix(String zuulPrefix) {
        this.zuulPrefix = zuulPrefix;
    }

    public String getServicePrefix() {
        return servicePrefix;
    }

    public void setServicePrefix(String servicePrefix) {
        this.servicePrefix = servicePrefix;
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public String getUri() {
        return uri;
    }

    public void setUri(String uri) {
        this.uri = uri;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}
