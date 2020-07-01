package com.sisc.myerp.service;

import com.sisc.myerp.bean.ProductInfo;

import java.util.List;

public interface ProductService {
    List<ProductInfo> productInfoList();

    ProductInfo add(ProductInfo productInfo);

    ProductInfo edit(ProductInfo productInfo);
}
