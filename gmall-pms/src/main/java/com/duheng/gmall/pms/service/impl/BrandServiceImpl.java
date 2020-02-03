package com.duheng.gmall.pms.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.duheng.gmall.pms.entity.Brand;
import com.duheng.gmall.pms.mapper.BrandMapper;
import com.duheng.gmall.pms.service.BrandService;
import com.duheng.gmall.vo.PageInfoVo;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 品牌表 服务实现类
 * </p>
 *
 * @author DuHeng
 * @since 2020-01-20
 */
@Service
public class BrandServiceImpl extends ServiceImpl<BrandMapper, Brand> implements BrandService {

    @Override
    public PageInfoVo brandPageInfo(String keyword, Integer pageNum, Integer pageSize) {
        return null;
    }
}
