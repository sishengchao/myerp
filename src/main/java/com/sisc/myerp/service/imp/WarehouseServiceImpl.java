package com.sisc.myerp.service.imp;

import com.sisc.myerp.bean.ProductInfo;
import com.sisc.myerp.bean.ProductInfoExample;
import com.sisc.myerp.bean.WarehouseInfo;
import com.sisc.myerp.bean.WarehouseInfoExample;
import com.sisc.myerp.dao.ProductInfoMapper;
import com.sisc.myerp.dao.WarehouseInfoMapper;
import com.sisc.myerp.service.ProductService;
import com.sisc.myerp.service.WarehouseService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class WarehouseServiceImpl implements WarehouseService {

    @Resource
    WarehouseInfoMapper warehouseInfoMapper;

    @Override
    public List<WarehouseInfo> warehouseInfoList(){
        WarehouseInfoExample warehouseInfoExample = new WarehouseInfoExample();
        warehouseInfoExample.createCriteria().andIdIsNotNull();
        return warehouseInfoMapper.selectByExampleWithBLOBs(warehouseInfoExample);
    }

    @Override
    public WarehouseInfo add(WarehouseInfo warehouseInfo){
        warehouseInfoMapper.insert(warehouseInfo);
        return warehouseInfo;
    }

    @Override
    public WarehouseInfo edit(WarehouseInfo warehouseInfo) {
        WarehouseInfo info = warehouseInfoMapper.selectByPrimaryKey(warehouseInfo.getId());
        info.setWaName(warehouseInfo.getWaName());
        info.setWaSynopsis(warehouseInfo.getWaSynopsis());
        warehouseInfoMapper.updateByPrimaryKeyWithBLOBs(info);
        return info;
    }
}
