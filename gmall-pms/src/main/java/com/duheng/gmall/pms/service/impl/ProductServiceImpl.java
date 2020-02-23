package com.duheng.gmall.pms.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.duheng.gmall.pms.entity.Product;
import com.duheng.gmall.pms.mapper.ProductMapper;
import com.duheng.gmall.pms.service.ProductService;
import com.duheng.gmall.vo.PageInfoVo;
import com.duheng.gmall.vo.product.PmsProductQueryParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

/**
 * <p>
 * 商品信息 服务实现类
 * </p>
 *
 * @author DuHeng
 * @since 2020-02-07
 */
@Service
@Component
public class ProductServiceImpl extends ServiceImpl<ProductMapper, Product> implements ProductService {
    @Autowired
    private ProductMapper productMapper;

    /**
     * 分页查询商品
     * @param param
     * @return
     */
    @Override
    public PageInfoVo productPageInfo(PmsProductQueryParam param) {
        QueryWrapper<Product> wrapper = new QueryWrapper<>();

        if (param.getBrandId() != null) {
            wrapper.eq("brand_id", param.getBrandId());
        }
        if (!StringUtils.isEmpty(param.getKeyword())) {
            wrapper.like("name", param.getKeyword());
        }
        if (param.getProductCategoryId() != null) {
            wrapper.eq("product_category_id", param.getProductCategoryId());
        }
        if (!StringUtils.isEmpty(param.getProductSn())) {
            wrapper.like("product_sn", param.getProductSn());
        }
        if (param.getPublishStatus() != null) {
            wrapper.eq("publish_status", param.getPublishStatus());
        }
        if (param.getVerifyStatus()!=null) {
            wrapper.eq("verify_status", param.getVerifyStatus());

        }
        IPage<Product> page = productMapper.selectPage(
                        new Page<>(param.getPageNum(),
                        param.getPageSize()),
                        wrapper);
        //查出的数据封装成PageInfo对象
        PageInfoVo pageInfoVo = new PageInfoVo();
        //查询的数据
        pageInfoVo.setList(page.getRecords());
        //当前页
        pageInfoVo.setPageNum(page.getCurrent());
        //每页的记录数
        pageInfoVo.setPageSize(page.getSize());
        //总页数
        pageInfoVo.setTotalPage(page.getPages());
        //总记录数
        pageInfoVo.setTotal(page.getTotal());

        return pageInfoVo;
    }
}
