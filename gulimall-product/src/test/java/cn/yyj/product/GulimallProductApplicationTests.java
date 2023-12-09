package cn.yyj.product;

import cn.yyj.product.entity.BrandEntity;
import cn.yyj.product.service.BrandService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class GulimallProductApplicationTests {

    @Test
    void contextLoads() {
    }

    @Autowired
    BrandService brandService;

    @Test
    void test() {
        BrandEntity brandEntity = new BrandEntity();
        brandEntity.setName("yyjtest");
        brandService.save(brandEntity);

    }

}
