package com.duheng.gmall.pms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.duheng.gmall.pms.entity.ProductAttributeCategory;
import com.duheng.gmall.vo.PageInfoVo;

/**
 * <p>
 * 产品属性分类表 服务类
 * </p>
 *
 * @author DuHeng
 * @since 2020-02-07
 */
public interface ProductAttributeCategoryService extends IService<ProductAttributeCategory> {

    PageInfoVo roductAttributeCategoryPageInfo(Integer pageNum, Integer pageSize);
}
