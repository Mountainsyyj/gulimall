package cn.yyj.coupon;

import cn.yyj.coupon.entity.HomeAdvEntity;
import cn.yyj.coupon.service.HomeAdvService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class GulimallCouponApplicationTests {

    @Test
    void contextLoads() {
    }

    @Autowired
    HomeAdvService homeAdvService;

    @Test
    void test() {
        HomeAdvEntity homeAdvEntity = new HomeAdvEntity();
        homeAdvEntity.setName("yyjtest");
        homeAdvService.save(homeAdvEntity);
    }

}
