package com.duheng.gmall.pms.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.duheng.gmall.pms.entity.ProductAttribute;
import com.duheng.gmall.pms.mapper.ProductAttributeMapper;
import com.duheng.gmall.pms.service.ProductAttributeService;
import com.duheng.gmall.vo.PageInfoVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * <p>
 * 商品属性参数表 服务实现类
 * </p>
 *
 * @author DuHeng
 * @since 2020-02-07
 */
@Service
@Component
public class ProductAttributeServiceImpl extends ServiceImpl<ProductAttributeMapper, ProductAttribute> implements ProductAttributeService {

    @Autowired
    private ProductAttributeMapper productAttributeMapper;
    @Override
    public PageInfoVo getCategoryAttributes(Long cid, Integer type, Integer pageSize, Integer pageNum) {
        QueryWrapper<ProductAttribute> wrapper = new QueryWrapper<ProductAttribute>().eq("product_attribute_category_id", cid).eq("type", type);

        IPage<ProductAttribute> iPage = productAttributeMapper.selectPage(new Page<>(pageNum, pageSize), wrapper);

        return PageInfoVo.getVo(iPage);
    }
}
