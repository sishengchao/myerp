package com.sisc.myerp.bean;

import java.util.Date;

/**
 *  TABLE 2020-04-21
 */
public class ProductInfo {
    /**
     * 
     *
     * @mbg.generated 2020-04-21
     */
    private Integer id;

    /**
     * 产品名称
     *
     * @mbg.generated 2020-04-21
     */
    private String productName;

    /**
     * 产品类别
     *
     * @mbg.generated 2020-04-21
     */
    private Integer productType;

    /**
     * 创建时间
     *
     * @mbg.generated 2020-04-21
     */
    private Date createDate;

    /**
     * 创建人
     *
     * @mbg.generated 2020-04-21
     */
    private String createUser;

    /**
     * 产品简介
     *
     * @mbg.generated 2020-04-21
     */
    private String productBriefly;

    /**
     * 
     * @return id 
     *
     * @mbg.generated 2020-04-21
     */
    public Integer getId() {
        return id;
    }

    /**
     * 
     * @param id 
     *
     * @mbg.generated 2020-04-21
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 产品名称
     * @return product_name 产品名称
     *
     * @mbg.generated 2020-04-21
     */
    public String getProductName() {
        return productName;
    }

    /**
     * 产品名称
     * @param productName 产品名称
     *
     * @mbg.generated 2020-04-21
     */
    public void setProductName(String productName) {
        this.productName = productName == null ? null : productName.trim();
    }

    /**
     * 产品类别
     * @return product_type 产品类别
     *
     * @mbg.generated 2020-04-21
     */
    public Integer getProductType() {
        return productType;
    }

    /**
     * 产品类别
     * @param productType 产品类别
     *
     * @mbg.generated 2020-04-21
     */
    public void setProductType(Integer productType) {
        this.productType = productType;
    }

    /**
     * 创建时间
     * @return create_date 创建时间
     *
     * @mbg.generated 2020-04-21
     */
    public Date getCreateDate() {
        return createDate;
    }

    /**
     * 创建时间
     * @param createDate 创建时间
     *
     * @mbg.generated 2020-04-21
     */
    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    /**
     * 创建人
     * @return create_user 创建人
     *
     * @mbg.generated 2020-04-21
     */
    public String getCreateUser() {
        return createUser;
    }

    /**
     * 创建人
     * @param createUser 创建人
     *
     * @mbg.generated 2020-04-21
     */
    public void setCreateUser(String createUser) {
        this.createUser = createUser == null ? null : createUser.trim();
    }

    /**
     * 产品简介
     * @return product_briefly 产品简介
     *
     * @mbg.generated 2020-04-21
     */
    public String getProductBriefly() {
        return productBriefly;
    }

    /**
     * 产品简介
     * @param productBriefly 产品简介
     *
     * @mbg.generated 2020-04-21
     */
    public void setProductBriefly(String productBriefly) {
        this.productBriefly = productBriefly == null ? null : productBriefly.trim();
    }
}