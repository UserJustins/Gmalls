package com.duheng.gmall.pms;

import com.duheng.gmall.pms.entity.Brand;
import com.duheng.gmall.pms.service.BrandService;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
class GmallPmsApplicationTests {
    @Autowired
    private BrandService brandService;
    @Test
    void contextLoads() {
        Brand byId =brandService.getById(56);
        System.out.println(byId);

    }

}
