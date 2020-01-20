package com.duheng.gmall.ums.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.duheng.gmall.ums.entity.Admin;
import com.duheng.gmall.ums.mapper.AdminMapper;
import com.duheng.gmall.ums.service.AdminService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 后台用户表 服务实现类
 * </p>
 *
 * @author DuHeng
 * @since 2020-01-20
 */
@Service
public class AdminServiceImpl extends ServiceImpl<AdminMapper, Admin> implements AdminService {

}
