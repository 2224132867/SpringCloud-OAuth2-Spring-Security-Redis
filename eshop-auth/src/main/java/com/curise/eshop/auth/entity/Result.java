package com.curise.eshop.auth.entity;

import lombok.Data;

/**
 * 〈响应实体〉
 *
 * @author Curise
 * @create 2018/12/13
 * @since 1.0.0
 */
//@Data
public class Result {

    private int code;
    private String message;
    private Object data;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
