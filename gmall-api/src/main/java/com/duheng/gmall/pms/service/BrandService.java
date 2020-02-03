package com.duheng.gmall.pms.service;

import com.duheng.gmall.pms.entity.Brand;
import com.baomidou.mybatisplus.extension.service.IService;
import com.duheng.gmall.vo.PageInfoVo;

/**
 * <p>
 * 品牌表 服务类
 * </p>
 *
 * @author DuHeng
 * @since 2020-01-20
 */
public interface BrandService extends IService<Brand> {

    PageInfoVo brandPageInfo(String keyword, Integer pageNum, Integer pageSize);
}
