package com.duheng.gmall.pms.service;

import com.duheng.gmall.pms.entity.ProductAttributeCategory;
import com.duheng.gmall.vo.PageInfoVo;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 * 产品属性分类表 服务类
 * </p>
 *
 * @author Lfy
 * @since 2019-05-08
 */
public interface ProductAttributeCategoryService extends IService<ProductAttributeCategory> {

    /**
     * 分页查询所有的属性分类
     * @param pageNum
     * @param pageSize
     * @return
     */
    PageInfoVo roductAttributeCategoryPageInfo(Integer pageNum, Integer pageSize);
}