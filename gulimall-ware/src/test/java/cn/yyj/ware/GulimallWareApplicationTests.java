package cn.yyj.ware;

import cn.yyj.ware.entity.WmsWareInfoEntity;
import cn.yyj.ware.service.WmsWareInfoService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class GulimallWareApplicationTests {

    @Test
    void contextLoads() {
    }


    @Autowired
    WmsWareInfoService wmsWareInfoService;

    @Test
    void test() {
        WmsWareInfoEntity wmsWareInfoEntity = new WmsWareInfoEntity();
        wmsWareInfoEntity.setName("yyjtest");
        wmsWareInfoService.save(wmsWareInfoEntity);
    }

}
