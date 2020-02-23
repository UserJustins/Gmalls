package com.duheng.gmall.ums.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.duheng.gmall.ums.entity.MemberLevel;
import com.duheng.gmall.ums.mapper.MemberLevelMapper;
import com.duheng.gmall.ums.service.MemberLevelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * <p>
 * 会员等级表 服务实现类
 * </p>
 *
 * @author DuHeng
 * @since 2020-01-20
 */
@Service
@Component
public class MemberLevelServiceImpl extends ServiceImpl<MemberLevelMapper, MemberLevel> implements MemberLevelService {
    @Autowired
    private MemberLevelMapper memberLevelMapper;
    @Override
    public List<MemberLevel> listAll() {
        return memberLevelMapper.selectList(new QueryWrapper<MemberLevel>());
    }
}
