package com.duheng.gmall.ums.service;

import com.duheng.gmall.ums.entity.MemberLevel;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 * 会员等级表 服务类
 * </p>
 *
 * @author DuHeng
 * @since 2020-01-20
 */
public interface MemberLevelService extends IService<MemberLevel> {

    List<MemberLevel> listAll();
}
