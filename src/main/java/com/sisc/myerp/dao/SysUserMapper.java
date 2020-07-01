package com.sisc.myerp.dao;

import com.sisc.myerp.bean.SysUser;
import com.sisc.myerp.bean.SysUserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface SysUserMapper {
    /**
     * @mbg.generated countByExample
     */
    long countByExample(SysUserExample example);

    /**
     * @mbg.generated deleteByExample
     */
    int deleteByExample(SysUserExample example);

    /**
     * @mbg.generated insert
     */
    int insert(SysUser record);

    /**
     * @mbg.generated insertSelective
     */
    int insertSelective(SysUser record);

    /**
     * @mbg.generated selectByExample
     */
    List<SysUser> selectByExample(SysUserExample example);

    /**
     * @mbg.generated updateByExampleSelective
     */
    int updateByExampleSelective(@Param("record") SysUser record, @Param("example") SysUserExample example);

    /**
     * @mbg.generated updateByExample
     */
    int updateByExample(@Param("record") SysUser record, @Param("example") SysUserExample example);
}