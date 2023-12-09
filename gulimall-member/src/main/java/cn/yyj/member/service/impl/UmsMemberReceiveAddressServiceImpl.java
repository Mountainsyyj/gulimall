package cn.yyj.member.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import cn.yyj.common.utils.PageUtils;
import cn.yyj.common.utils.Query;

import cn.yyj.member.dao.UmsMemberReceiveAddressDao;
import cn.yyj.member.entity.UmsMemberReceiveAddressEntity;
import cn.yyj.member.service.UmsMemberReceiveAddressService;


@Service("umsMemberReceiveAddressService")
public class UmsMemberReceiveAddressServiceImpl extends ServiceImpl<UmsMemberReceiveAddressDao, UmsMemberReceiveAddressEntity> implements UmsMemberReceiveAddressService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<UmsMemberReceiveAddressEntity> page = this.page(
                new Query<UmsMemberReceiveAddressEntity>().getPage(params),
                new QueryWrapper<UmsMemberReceiveAddressEntity>()
        );

        return new PageUtils(page);
    }

}