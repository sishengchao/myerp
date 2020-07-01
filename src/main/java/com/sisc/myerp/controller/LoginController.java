package com.sisc.myerp.controller;

import com.alibaba.fastjson.JSON;
import com.sisc.myerp.bean.SysUser;
import com.sisc.myerp.service.SysUserService;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Log4j2
@Controller
public class LoginController {

    @Autowired
    SysUserService sysUserService;


    @ResponseBody
    @RequestMapping("ajaxLogin")
    public ResponseBodyBean ajaxLogin(HttpServletRequest request, HttpServletResponse response, @RequestBody SysUser sysUser) {
        ResponseBodyBean responseBodyBean= new ResponseBodyBean();
        try {
            SysUser sysUserDb = sysUserService.getSysUserByNo(sysUser.getUserNo());
            log.info(JSON.toJSONString(sysUser));
            if(sysUserDb.getPassword().equals(sysUser.getPassword())){
                request.getSession().setAttribute("user",sysUserDb);
                responseBodyBean.setEnum(ResponseEnum.SUCCESS);
            }else {
                responseBodyBean.setEnum(ResponseEnum.PWD_ERR);
            }
        }catch (Exception e){
            responseBodyBean.setEnum(ResponseEnum.ERR);
        }
        return responseBodyBean;
    }

    @RequestMapping("signOut")
    public void signOut(HttpServletRequest request, HttpServletResponse response) throws IOException {
        request.getSession().setAttribute("user",null);
        response.sendRedirect("/login");
    }
}
