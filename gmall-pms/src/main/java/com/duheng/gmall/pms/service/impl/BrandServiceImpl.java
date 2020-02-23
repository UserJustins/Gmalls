package com.duheng.gmall.pms.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.duheng.gmall.pms.entity.Brand;
import com.duheng.gmall.pms.mapper.BrandMapper;
import com.duheng.gmall.pms.service.BrandService;
import com.duheng.gmall.vo.PageInfoVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

/**
 * <p>
 * 品牌表 服务实现类
 * </p>
 *
 * @author DuHeng
 * @since 2020-02-07
 */
@Service
@Component
public class BrandServiceImpl extends ServiceImpl<BrandMapper, Brand> implements BrandService {
    @Autowired
    private BrandMapper brandMapper;

    /**
     * 商品品牌下拉列表查询
     * @param keyword
     * @param pageNum
     * @param pageSize
     * @return
     */
    @Override
    public PageInfoVo brandPageInfo(String keyword, Integer pageNum, Integer pageSize) {
        QueryWrapper<Brand> wrapper = null;
        if (!StringUtils.isEmpty(keyword)) {
            wrapper = new QueryWrapper<Brand>().like("name", keyword);
        }
        IPage<Brand> brandPage = brandMapper.selectPage(new Page<>(pageNum, pageSize), wrapper);
        return new PageInfoVo(brandPage.getTotal(),
                brandPage.getPages(),
                brandPage.getSize(),
                brandPage.getRecords(),
                brandPage.getCurrent());
    }
}
