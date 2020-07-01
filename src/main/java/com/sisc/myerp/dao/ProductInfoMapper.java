package com.sisc.myerp.dao;

import com.sisc.myerp.bean.ProductInfo;
import com.sisc.myerp.bean.ProductInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProductInfoMapper {
    /**
     * @mbg.generated countByExample
     */
    long countByExample(ProductInfoExample example);

    /**
     * @mbg.generated deleteByExample
     */
    int deleteByExample(ProductInfoExample example);

    /**
     * @mbg.generated deleteByPrimaryKey
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * @mbg.generated insert
     */
    int insert(ProductInfo record);

    /**
     * @mbg.generated insertSelective
     */
    int insertSelective(ProductInfo record);

    /**
     * @mbg.generated selectByExampleWithBLOBs
     */
    List<ProductInfo> selectByExampleWithBLOBs(ProductInfoExample example);

    /**
     * @mbg.generated selectByExample
     */
    List<ProductInfo> selectByExample(ProductInfoExample example);

    /**
     * @mbg.generated selectByPrimaryKey
     */
    ProductInfo selectByPrimaryKey(Integer id);

    /**
     * @mbg.generated updateByExampleSelective
     */
    int updateByExampleSelective(@Param("record") ProductInfo record, @Param("example") ProductInfoExample example);

    /**
     * @mbg.generated updateByExampleWithBLOBs
     */
    int updateByExampleWithBLOBs(@Param("record") ProductInfo record, @Param("example") ProductInfoExample example);

    /**
     * @mbg.generated updateByExample
     */
    int updateByExample(@Param("record") ProductInfo record, @Param("example") ProductInfoExample example);

    /**
     * @mbg.generated updateByPrimaryKeySelective
     */
    int updateByPrimaryKeySelective(ProductInfo record);

    /**
     * @mbg.generated updateByPrimaryKeyWithBLOBs
     */
    int updateByPrimaryKeyWithBLOBs(ProductInfo record);

    /**
     * @mbg.generated updateByPrimaryKey
     */
    int updateByPrimaryKey(ProductInfo record);
}