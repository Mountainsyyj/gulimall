package cn.yyj.member;

import cn.yyj.member.entity.UmsMemberEntity;
import cn.yyj.member.service.UmsMemberService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class GulimallMemberApplicationTests {

    @Test
    void contextLoads() {
    }


    @Autowired
    UmsMemberService umsMemberService;

    @Test
    void test() {
        UmsMemberEntity umsMemberEntity = new UmsMemberEntity();
        umsMemberEntity.setUsername("yyjtest");
        umsMemberService.save(umsMemberEntity);
    }

}
