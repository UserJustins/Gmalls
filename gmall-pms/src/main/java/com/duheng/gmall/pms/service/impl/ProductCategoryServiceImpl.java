package com.duheng.gmall.pms.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.duheng.gmall.constant.SysCacheConstant;
import com.duheng.gmall.pms.entity.ProductCategory;
import com.duheng.gmall.pms.mapper.ProductCategoryMapper;
import com.duheng.gmall.pms.service.ProductCategoryService;
import com.duheng.gmall.vo.product.PmsProductCategoryWithChildrenItem;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * <p>
 * 产品分类 服务实现类
 * </p>
 *
 * @author DuHeng
 * @since 2020-02-07
 */
@Slf4j
@Service
@Component
public class ProductCategoryServiceImpl extends ServiceImpl<ProductCategoryMapper, ProductCategory> implements ProductCategoryService {
    @Autowired
    private ProductCategoryMapper productCategoryMapper;
    @Autowired
    private RedisTemplate redisTemplate;

    /**
     * 属性结构的查询，进行缓存处理
     *
     * @param i
     * @return
     */
    @Override
    public List<PmsProductCategoryWithChildrenItem> listCatelogWithChilder(long i) {

        Object cache = redisTemplate.opsForValue().get(SysCacheConstant.CATEGROY_MENU_CACHE_KEY);

        if (cache !=null) {
            log.debug("目录菜单缓存被命中");
            return (List<PmsProductCategoryWithChildrenItem>) cache;
        }
        log.debug("目录菜单数据去后台系统查询");
        List<PmsProductCategoryWithChildrenItem> items = productCategoryMapper.selCatelogWithChilder(i);
        redisTemplate.opsForValue().set(SysCacheConstant.CATEGROY_MENU_CACHE_KEY,items);
        return  items;
    }
}
