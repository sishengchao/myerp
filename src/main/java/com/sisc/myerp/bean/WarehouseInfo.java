package com.sisc.myerp.bean;

import java.util.Date;

/**
 *  TABLE 2020-05-09
 */
public class WarehouseInfo {
    /**
     * 
     *
     * @mbg.generated 2020-05-09
     */
    private Integer id;

    /**
     * 仓库名称
     *
     * @mbg.generated 2020-05-09
     */
    private String waName;

    /**
     * 创建时间
     *
     * @mbg.generated 2020-05-09
     */
    private Date createDate;

    /**
     * 创建人
     *
     * @mbg.generated 2020-05-09
     */
    private String createUser;

    /**
     * 
     *
     * @mbg.generated 2020-05-09
     */
    private String waSynopsis;

    /**
     * 
     * @return id 
     *
     * @mbg.generated 2020-05-09
     */
    public Integer getId() {
        return id;
    }

    /**
     * 
     * @param id 
     *
     * @mbg.generated 2020-05-09
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 仓库名称
     * @return wa_name 仓库名称
     *
     * @mbg.generated 2020-05-09
     */
    public String getWaName() {
        return waName;
    }

    /**
     * 仓库名称
     * @param waName 仓库名称
     *
     * @mbg.generated 2020-05-09
     */
    public void setWaName(String waName) {
        this.waName = waName == null ? null : waName.trim();
    }

    /**
     * 创建时间
     * @return create_date 创建时间
     *
     * @mbg.generated 2020-05-09
     */
    public Date getCreateDate() {
        return createDate;
    }

    /**
     * 创建时间
     * @param createDate 创建时间
     *
     * @mbg.generated 2020-05-09
     */
    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    /**
     * 创建人
     * @return create_user 创建人
     *
     * @mbg.generated 2020-05-09
     */
    public String getCreateUser() {
        return createUser;
    }

    /**
     * 创建人
     * @param createUser 创建人
     *
     * @mbg.generated 2020-05-09
     */
    public void setCreateUser(String createUser) {
        this.createUser = createUser == null ? null : createUser.trim();
    }

    /**
     * 
     * @return wa_synopsis 
     *
     * @mbg.generated 2020-05-09
     */
    public String getWaSynopsis() {
        return waSynopsis;
    }

    /**
     * 
     * @param waSynopsis 
     *
     * @mbg.generated 2020-05-09
     */
    public void setWaSynopsis(String waSynopsis) {
        this.waSynopsis = waSynopsis == null ? null : waSynopsis.trim();
    }
}