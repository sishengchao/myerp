package com.sisc.myerp.bean;

import java.util.Date;

/**
 *  TABLE 2020-04-19
 */
public class SysUser {
    /**
     * 用户编号
     *
     * @mbg.generated 2020-04-19
     */
    private String userNo;

    /**
     * 用户名
     *
     * @mbg.generated 2020-04-19
     */
    private String userName;

    /**
     * 密码
     *
     * @mbg.generated 2020-04-19
     */
    private String password;

    /**
     * 有效性 1无效 0有效
     *
     * @mbg.generated 2020-04-19
     */
    private String effective;

    /**
     * 锁定状态：1锁 0未锁
     *
     * @mbg.generated 2020-04-19
     */
    private String lockUp;

    /**
     * 创建人
     *
     * @mbg.generated 2020-04-19
     */
    private String createUser;

    /**
     * 创建时间
     *
     * @mbg.generated 2020-04-19
     */
    private Date createDate;

    /**
     * 用户编号
     * @return user_no 用户编号
     *
     * @mbg.generated 2020-04-19
     */
    public String getUserNo() {
        return userNo;
    }

    /**
     * 用户编号
     * @param userNo 用户编号
     *
     * @mbg.generated 2020-04-19
     */
    public void setUserNo(String userNo) {
        this.userNo = userNo == null ? null : userNo.trim();
    }

    /**
     * 用户名
     * @return user_name 用户名
     *
     * @mbg.generated 2020-04-19
     */
    public String getUserName() {
        return userName;
    }

    /**
     * 用户名
     * @param userName 用户名
     *
     * @mbg.generated 2020-04-19
     */
    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    /**
     * 密码
     * @return password 密码
     *
     * @mbg.generated 2020-04-19
     */
    public String getPassword() {
        return password;
    }

    /**
     * 密码
     * @param password 密码
     *
     * @mbg.generated 2020-04-19
     */
    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    /**
     * 有效性 1无效 0有效
     * @return effective 有效性 1无效 0有效
     *
     * @mbg.generated 2020-04-19
     */
    public String getEffective() {
        return effective;
    }

    /**
     * 有效性 1无效 0有效
     * @param effective 有效性 1无效 0有效
     *
     * @mbg.generated 2020-04-19
     */
    public void setEffective(String effective) {
        this.effective = effective == null ? null : effective.trim();
    }

    /**
     * 锁定状态：1锁 0未锁
     * @return Lock_up 锁定状态：1锁 0未锁
     *
     * @mbg.generated 2020-04-19
     */
    public String getLockUp() {
        return lockUp;
    }

    /**
     * 锁定状态：1锁 0未锁
     * @param lockUp 锁定状态：1锁 0未锁
     *
     * @mbg.generated 2020-04-19
     */
    public void setLockUp(String lockUp) {
        this.lockUp = lockUp == null ? null : lockUp.trim();
    }

    /**
     * 创建人
     * @return create_user 创建人
     *
     * @mbg.generated 2020-04-19
     */
    public String getCreateUser() {
        return createUser;
    }

    /**
     * 创建人
     * @param createUser 创建人
     *
     * @mbg.generated 2020-04-19
     */
    public void setCreateUser(String createUser) {
        this.createUser = createUser == null ? null : createUser.trim();
    }

    /**
     * 创建时间
     * @return create_date 创建时间
     *
     * @mbg.generated 2020-04-19
     */
    public Date getCreateDate() {
        return createDate;
    }

    /**
     * 创建时间
     * @param createDate 创建时间
     *
     * @mbg.generated 2020-04-19
     */
    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }
}