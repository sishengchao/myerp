package com.sisc.myerp.controller;

import com.sisc.myerp.bean.ProductInfo;
import com.sisc.myerp.bean.SysUser;
import com.sisc.myerp.bean.WarehouseInfo;
import com.sisc.myerp.service.imp.WarehouseServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("warehouse")
public class WarehouseController {

    @Autowired
    WarehouseServiceImpl warehouseService;

    @ResponseBody
    @RequestMapping("list")
    public ResponseBodyBean<List<WarehouseInfo>> productList(){
        ResponseBodyBean<List<WarehouseInfo>> responseBodyBean= new ResponseBodyBean();
        responseBodyBean.setEnum(ResponseEnum.SUCCESS);
        responseBodyBean.setData(warehouseService.warehouseInfoList());
        return responseBodyBean;
    }

    @ResponseBody
    @RequestMapping("add")
    public ResponseBodyBean<WarehouseInfo> addProduct(@RequestBody WarehouseInfo warehouseInfo, HttpServletRequest httpServletRequest){
        SysUser sysUser = (SysUser) httpServletRequest.getSession().getAttribute("user");
        ResponseBodyBean<WarehouseInfo> responseBodyBean= new ResponseBodyBean();
        if(sysUser!=null){
            warehouseInfo.setCreateUser(sysUser.getUserNo());
        }else {
            responseBodyBean.setEnum(ResponseEnum.NULL_PARAME);
            responseBodyBean.setData(warehouseInfo);
            return responseBodyBean;
        }
        warehouseInfo.setCreateDate(new Date());
        warehouseService.add(warehouseInfo);
        responseBodyBean.setEnum(ResponseEnum.SUCCESS);
        responseBodyBean.setData(warehouseInfo);
        return responseBodyBean;
    }

    @ResponseBody
    @RequestMapping("edit")
    public ResponseBodyBean<WarehouseInfo> editProduct(@RequestBody WarehouseInfo warehouseInfo, HttpServletRequest httpServletRequest){
        warehouseService.edit(warehouseInfo);
        ResponseBodyBean<WarehouseInfo> responseBodyBean= new ResponseBodyBean();
        responseBodyBean.setEnum(ResponseEnum.SUCCESS);
        responseBodyBean.setData(warehouseInfo);
        return responseBodyBean;
    }
}
