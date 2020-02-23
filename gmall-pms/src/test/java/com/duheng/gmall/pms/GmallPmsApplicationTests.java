package com.duheng.gmall.pms;

import com.duheng.gmall.pms.entity.Brand;
import com.duheng.gmall.pms.service.BrandService;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
class GmallPmsApplicationTests {
    @Autowired
    private BrandService brandService;
    @Autowired
    private RedisTemplate redisTemplate;
    @Test
    void contextLoads() {
        Brand byId =brandService.getById(56);
        System.out.println(byId);

    }
    @Test
    void test_01(){
        Brand brand = new Brand();
        brand.setName("啊哈哈");
        redisTemplate.opsForValue().set("hello",brand);
        System.out.println(redisTemplate.opsForValue().get("hello"));
    }

}
