package com.albedo.java.util.domain;

import com.alibaba.fastjson.annotation.JSONField;


import java.util.Date;


/**
 * 系统日志
 *
 * @author yanting
 * @date 2018-09-07
 */
public class SysLogEntity {

    /**
     * 用户名
     */
    private String username;

    /**
     * 用户操作
     */
    private String operation;

    /**
     * 请求方法
     */
    private String method;

    /**
     * 请求参数
     */
    private Object[] params;

    /**
     * 执行耗时
     */
    private Long time;

    /**
     * IP
     */
    private String ip;

    /**
     * 创建时间
     */
    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    private Date createDate;

    /**
     * 设置：用户名
     */
    public void setUsername(String username) {
        this.username = username;
    }
    /**
     * 获取：用户名
     */
    public String getUsername() {
        return username;
    }
    /**
     * 设置：用户操作
     */
    public void setOperation(String operation) {
        this.operation = operation;
    }
    /**
     * 获取：用户操作
     */
    public String getOperation() {
        return operation;
    }
    /**
     * 设置：请求方法
     */
    public void setMethod(String method) {
        this.method = method;
    }
    /**
     * 获取：请求方法
     */
    public String getMethod() {
        return method;
    }
    /**
     * 设置：请求参数
     */
    public void setParams(Object[] params) {
        this.params = params;
    }
    /**
     * 获取：请求参数
     */
    public Object[] getParams() {
        return params;
    }
    /**
     * 设置：IP地址
     */
    public void setIp(String ip) {
        this.ip = ip;
    }
    /**
     * 获取：IP地址
     */
    public String getIp() {
        return ip;
    }
    /**
     * 设置：创建时间
     */
    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }
    /**
     * 获取：创建时间
     */
    public Date getCreateDate() {
        return createDate;
    }

    public Long getTime() {
        return time;
    }

    public void setTime(Long time) {
        this.time = time;
    }
}
