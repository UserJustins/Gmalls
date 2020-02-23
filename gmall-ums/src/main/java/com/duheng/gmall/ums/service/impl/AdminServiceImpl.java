package com.duheng.gmall.ums.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.duheng.gmall.ums.entity.Admin;
import com.duheng.gmall.ums.mapper.AdminMapper;
import com.duheng.gmall.ums.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.DigestUtils;

/**
 * <p>
 * 后台用户表 服务实现类
 * </p>
 *
 * @author DuHeng
 * @since 2020-01-20
 */
@Service
@Component
public class AdminServiceImpl extends ServiceImpl<AdminMapper, Admin> implements AdminService {
    @Autowired
    private AdminMapper adminMapper;

    /**
     * 根据用户名和密码查询
     * @param username
     * @param password
     * @return
     */
    @Override
    public Admin login(String username, String password) {
        //DigestUtils.md5Digest(password.getBytes())spring自带的加密工具
        QueryWrapper<Admin> eq = new QueryWrapper<Admin>().eq("username", username).
                eq("password", DigestUtils.md5DigestAsHex(password.getBytes()));

        return adminMapper.selectOne(eq);
    }

    /**
     * 查询用户信息
     * @param userName
     * @return
     */
    @Override
    public Admin getUserInfo(String userName) {
        QueryWrapper<Admin> eq = new QueryWrapper<Admin>().eq("username", userName);
        return adminMapper.selectOne(eq);
    }
}
