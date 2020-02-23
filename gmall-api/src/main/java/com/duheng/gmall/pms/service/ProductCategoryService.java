package com.duheng.gmall.pms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.duheng.gmall.pms.entity.ProductCategory;
import com.duheng.gmall.vo.product.PmsProductCategoryWithChildrenItem;

import java.util.List;

/**
 * <p>
 * 产品分类 服务类
 * </p>
 *
 * @author DuHeng
 * @since 2020-02-07
 */
public interface ProductCategoryService extends IService<ProductCategory> {

    List<PmsProductCategoryWithChildrenItem> listCatelogWithChilder(long i);
}
