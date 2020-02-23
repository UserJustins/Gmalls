package com.duheng.gmall.admin.ums.controller;


import com.alibaba.dubbo.config.annotation.Reference;
import com.duheng.gmall.to.CommonResult;
import com.duheng.gmall.ums.entity.MemberLevel;
import com.duheng.gmall.ums.service.MemberLevelService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@CrossOrigin
@RestController
public class UmsMemberLevelController {


    @Reference
    MemberLevelService memberLevelService;
    /**
     * 查出所有会员等级
     * @return
     */
    @GetMapping("/memberLevel/list")
    public CommonResult memberLevelList(){
        List<MemberLevel> list = memberLevelService.listAll();
        return new CommonResult().success(list);
    }
}
