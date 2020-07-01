package com.sisc.myerp.controller;


public enum ResponseEnum {
    SUCCESS("0000","成功！"),
    PWD_ERR("0001","用户名密码错误！"),
    NULL_PARAME("0002","缺少参数！"),
    ERR("9999","系统异常！")
    ;
    private String code;
    private String msg;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    ResponseEnum(String code, String msg) {
        this.code = code;
        this.msg = msg;
    }
}
