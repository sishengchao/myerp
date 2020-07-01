package com.sisc.myerp.dao;

import com.sisc.myerp.bean.WarehouseInfo;
import com.sisc.myerp.bean.WarehouseInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WarehouseInfoMapper {
    /**
     * @mbg.generated countByExample
     */
    long countByExample(WarehouseInfoExample example);

    /**
     * @mbg.generated deleteByExample
     */
    int deleteByExample(WarehouseInfoExample example);

    /**
     * @mbg.generated deleteByPrimaryKey
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * @mbg.generated insert
     */
    int insert(WarehouseInfo record);

    /**
     * @mbg.generated insertSelective
     */
    int insertSelective(WarehouseInfo record);

    /**
     * @mbg.generated selectByExampleWithBLOBs
     */
    List<WarehouseInfo> selectByExampleWithBLOBs(WarehouseInfoExample example);

    /**
     * @mbg.generated selectByExample
     */
    List<WarehouseInfo> selectByExample(WarehouseInfoExample example);

    /**
     * @mbg.generated selectByPrimaryKey
     */
    WarehouseInfo selectByPrimaryKey(Integer id);

    /**
     * @mbg.generated updateByExampleSelective
     */
    int updateByExampleSelective(@Param("record") WarehouseInfo record, @Param("example") WarehouseInfoExample example);

    /**
     * @mbg.generated updateByExampleWithBLOBs
     */
    int updateByExampleWithBLOBs(@Param("record") WarehouseInfo record, @Param("example") WarehouseInfoExample example);

    /**
     * @mbg.generated updateByExample
     */
    int updateByExample(@Param("record") WarehouseInfo record, @Param("example") WarehouseInfoExample example);

    /**
     * @mbg.generated updateByPrimaryKeySelective
     */
    int updateByPrimaryKeySelective(WarehouseInfo record);

    /**
     * @mbg.generated updateByPrimaryKeyWithBLOBs
     */
    int updateByPrimaryKeyWithBLOBs(WarehouseInfo record);

    /**
     * @mbg.generated updateByPrimaryKey
     */
    int updateByPrimaryKey(WarehouseInfo record);
}