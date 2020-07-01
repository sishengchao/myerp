package com.sisc.myerp.service;

import com.sisc.myerp.bean.ProductInfo;
import com.sisc.myerp.bean.WarehouseInfo;

import java.util.List;

public interface WarehouseService {
    List<WarehouseInfo> warehouseInfoList();

    WarehouseInfo add(WarehouseInfo warehouseInfo);

    WarehouseInfo edit(WarehouseInfo warehouseInfo);
}
