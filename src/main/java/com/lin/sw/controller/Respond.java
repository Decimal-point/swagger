package com.lin.sw.controller;

import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

public class Respond implements Serializable{
    @ApiModelProperty(value = "状态码",dataType = "String")
    private String code;
    @ApiModelProperty(value = "版本号",dataType = "String")
    private String vession;
    @ApiModelProperty(value = "返回信息",dataType = "String")
    private String messge;


    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getVession() {
        return vession;
    }

    public void setVession(String vession) {
        this.vession = vession;
    }

    public String getMessge() {
        return messge;
    }

    public void setMessge(String messge) {
        this.messge = messge;
    }
}
