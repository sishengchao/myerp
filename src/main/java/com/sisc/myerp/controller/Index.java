package com.sisc.myerp.controller;

import com.alibaba.fastjson.JSON;
import com.sisc.myerp.bean.SysUser;
import com.sisc.myerp.service.SysUserService;

import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Log4j2
@Controller
public class Index {

    @RequestMapping("index")
    public String indexHtml(){
      return "index";
    }

    @RequestMapping("menu")
    public String menuHtml(){
        return "menu";
    }

    @RequestMapping("order")
    public String orederHtml(){
        return "order";
    }

    @RequestMapping("login")
    public String loginHtml(){
        return "login";
    }

}
