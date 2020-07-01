package com.sisc.myerp.controller;

import com.sisc.myerp.bean.SysUser;
import lombok.Data;

@Data
public class ResponseBodyBean<T> {
    private String code;
    private String msg;
    private T data;
    private SysUser user;

    public void setEnum(ResponseEnum anEnum){
        this.setCode(anEnum.getCode());
        this.setMsg(anEnum.getMsg());
    }

}


