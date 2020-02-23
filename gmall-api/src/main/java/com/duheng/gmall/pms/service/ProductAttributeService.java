package com.duheng.gmall.pms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.duheng.gmall.pms.entity.ProductAttribute;
import com.duheng.gmall.vo.PageInfoVo;

/**
 * <p>
 * 商品属性参数表 服务类
 * </p>
 *
 * @author DuHeng
 * @since 2020-02-07
 */
public interface ProductAttributeService extends IService<ProductAttribute> {

    PageInfoVo getCategoryAttributes(Long cid,Integer type,Integer pageSize, Integer pageNum);
}
