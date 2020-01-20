package com.duheng.gmall.ums.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.duheng.gmall.ums.entity.AdminLoginLog;
import com.duheng.gmall.ums.mapper.AdminLoginLogMapper;
import com.duheng.gmall.ums.service.AdminLoginLogService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 后台用户登录日志表 服务实现类
 * </p>
 *
 * @author DuHeng
 * @since 2020-01-20
 */
@Service
public class AdminLoginLogServiceImpl extends ServiceImpl<AdminLoginLogMapper, AdminLoginLog> implements AdminLoginLogService {

}
