package com.duheng.gmall.pms.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.duheng.gmall.pms.entity.BaseAttrInfo;
import com.duheng.gmall.pms.mapper.BaseAttrInfoMapper;
import com.duheng.gmall.pms.service.BaseAttrInfoService;
import org.springframework.stereotype.Component;

/**
 * <p>
 * 属性表 服务实现类
 * </p>
 *
 * @author DuHeng
 * @since 2020-01-20
 */
@Service//Dubbo的@Service
@Component
public class BaseAttrInfoServiceImpl extends ServiceImpl<BaseAttrInfoMapper, BaseAttrInfo> implements BaseAttrInfoService {

}
