package com.sisc.myerp.controller;

import com.sisc.myerp.bean.ProductInfo;
import com.sisc.myerp.bean.SysUser;
import com.sisc.myerp.service.imp.ProductServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("product")
public class ProductController {

    @Autowired
    ProductServiceImpl productService;

    @ResponseBody
    @RequestMapping("productList")
    public ResponseBodyBean<List<ProductInfo>> productList(){
        ResponseBodyBean<List<ProductInfo>> responseBodyBean= new ResponseBodyBean();
        responseBodyBean.setEnum(ResponseEnum.SUCCESS);
        responseBodyBean.setData(productService.productInfoList());
        return responseBodyBean;
    }

    @ResponseBody
    @RequestMapping("add")
    public ResponseBodyBean<ProductInfo> addProduct(@RequestBody ProductInfo productInfo, HttpServletRequest httpServletRequest){
        SysUser sysUser = (SysUser) httpServletRequest.getSession().getAttribute("user");
        if(sysUser!=null){
            productInfo.setCreateUser(sysUser.getUserNo());
        }else {
            ResponseBodyBean<ProductInfo> responseBodyBean= new ResponseBodyBean();
            responseBodyBean.setEnum(ResponseEnum.NULL_PARAME);
            responseBodyBean.setData(productInfo);
            return responseBodyBean;
        }
        productInfo.setProductType(1);
        productInfo.setCreateDate(new Date());
        productService.add(productInfo);
        ResponseBodyBean<ProductInfo> responseBodyBean= new ResponseBodyBean();
        responseBodyBean.setEnum(ResponseEnum.SUCCESS);
        responseBodyBean.setData(productInfo);
        return responseBodyBean;
    }

    @ResponseBody
    @RequestMapping("edit")
    public ResponseBodyBean<ProductInfo> editProduct(@RequestBody ProductInfo productInfo, HttpServletRequest httpServletRequest){
        productService.edit(productInfo);
        ResponseBodyBean<ProductInfo> responseBodyBean= new ResponseBodyBean();
        responseBodyBean.setEnum(ResponseEnum.SUCCESS);
        responseBodyBean.setData(productInfo);
        return responseBodyBean;
    }
}
