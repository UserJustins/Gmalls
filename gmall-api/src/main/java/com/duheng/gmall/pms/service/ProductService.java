package com.duheng.gmall.pms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.duheng.gmall.pms.entity.Product;
import com.duheng.gmall.vo.PageInfoVo;
import com.duheng.gmall.vo.product.PmsProductQueryParam;

/**
 * <p>
 * 商品信息 服务类
 * </p>
 *
 * @author DuHeng
 * @since 2020-02-07
 */
public interface ProductService extends IService<Product> {
    /**
     * 复杂的商品分页查询
     * @param productQueryParam
     * @return
     */
    PageInfoVo productPageInfo(PmsProductQueryParam productQueryParam);
}
