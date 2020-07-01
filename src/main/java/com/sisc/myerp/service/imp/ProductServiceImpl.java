package com.sisc.myerp.service.imp;

import com.sisc.myerp.bean.ProductInfo;
import com.sisc.myerp.bean.ProductInfoExample;
import com.sisc.myerp.dao.ProductInfoMapper;
import com.sisc.myerp.service.ProductService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    @Resource
    ProductInfoMapper productInfoMapper;

    @Override
    public List<ProductInfo> productInfoList(){
        ProductInfoExample productInfoExample = new ProductInfoExample();
        productInfoExample.createCriteria().andIdIsNotNull();
        return productInfoMapper.selectByExampleWithBLOBs(productInfoExample);
    }

    @Override
    public ProductInfo add(ProductInfo productInfo){
        productInfoMapper.insert(productInfo);
        return productInfo;
    }

    @Override
    public ProductInfo edit(ProductInfo productInfo) {
        ProductInfo info = productInfoMapper.selectByPrimaryKey(productInfo.getId());
        info.setProductName(productInfo.getProductName());
        info.setProductBriefly(productInfo.getProductBriefly());
        productInfoMapper.updateByPrimaryKeyWithBLOBs(info);
        return info;
    }
}
