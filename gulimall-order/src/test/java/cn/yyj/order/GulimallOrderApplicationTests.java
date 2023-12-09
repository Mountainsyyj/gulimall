package cn.yyj.order;

import cn.yyj.order.entity.OmsOrderEntity;
import cn.yyj.order.service.OmsOrderService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class GulimallOrderApplicationTests {

    @Test
    void contextLoads() {
    }

    @Autowired
    OmsOrderService omsOrderService;

    @Test
    void test() {
        OmsOrderEntity omsOrderEntity = new OmsOrderEntity();
        omsOrderEntity.setMemberUsername("yyjtest");
        omsOrderService.save(omsOrderEntity);
    }

}
