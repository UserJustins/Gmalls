package com.duheng.gmall.pms.service.impl;

import com.duheng.gmall.pms.entity.Product;
import com.duheng.gmall.pms.mapper.ProductMapper;
import com.duheng.gmall.pms.service.ProductService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 商品信息 服务实现类
 * </p>
 *
 * @author DuHeng
 * @since 2020-02-07
 */
@Service
public class ProductServiceImpl extends ServiceImpl<ProductMapper, Product> implements ProductService {

}
