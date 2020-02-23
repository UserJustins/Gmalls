package com.duheng.gmall.pms.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.duheng.gmall.pms.entity.ProductAttributeCategory;
import com.duheng.gmall.pms.mapper.ProductAttributeCategoryMapper;
import com.duheng.gmall.pms.service.ProductAttributeCategoryService;
import com.duheng.gmall.vo.PageInfoVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * <p>
 * 产品属性分类表 服务实现类
 * </p>
 *
 * @author DuHeng
 * @since 2020-02-07
 */
@Service
@Component
public class ProductAttributeCategoryServiceImpl extends ServiceImpl<ProductAttributeCategoryMapper, ProductAttributeCategory> implements ProductAttributeCategoryService {
    @Autowired
    private ProductAttributeCategoryMapper productAttributeCategoryMapper;
    @Override
    public PageInfoVo roductAttributeCategoryPageInfo(Integer pageNum, Integer pageSize) {
        IPage<ProductAttributeCategory> iPage = productAttributeCategoryMapper.selectPage(
                new Page<>(pageNum, pageSize),
                new QueryWrapper<>());
        return PageInfoVo.getVo(iPage);
    }
}
