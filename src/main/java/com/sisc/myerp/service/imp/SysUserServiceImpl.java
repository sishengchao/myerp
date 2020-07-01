package com.sisc.myerp.service.imp;

import com.sisc.myerp.bean.SysUser;
import com.sisc.myerp.bean.SysUserExample;
import com.sisc.myerp.dao.SysUserMapper;
import com.sisc.myerp.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import javax.annotation.Resource;
import java.util.List;

@Service
public class SysUserServiceImpl implements SysUserService {

    @Resource
    SysUserMapper sysUserMapper;

    @Override
    public SysUser getSysUserByNo(String userNo){
        SysUserExample sysUserExample = new SysUserExample();
        sysUserExample.createCriteria().andUserNoEqualTo(userNo);
        List<SysUser> sysUserList = sysUserMapper.selectByExample(sysUserExample);
        if(!CollectionUtils.isEmpty(sysUserList)){
            return sysUserList.get(0);
        }
        return new SysUser();
    }
}
