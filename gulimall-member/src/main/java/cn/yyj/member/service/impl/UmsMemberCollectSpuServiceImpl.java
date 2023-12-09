package cn.yyj.member.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import cn.yyj.common.utils.PageUtils;
import cn.yyj.common.utils.Query;

import cn.yyj.member.dao.UmsMemberCollectSpuDao;
import cn.yyj.member.entity.UmsMemberCollectSpuEntity;
import cn.yyj.member.service.UmsMemberCollectSpuService;


@Service("umsMemberCollectSpuService")
public class UmsMemberCollectSpuServiceImpl extends ServiceImpl<UmsMemberCollectSpuDao, UmsMemberCollectSpuEntity> implements UmsMemberCollectSpuService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<UmsMemberCollectSpuEntity> page = this.page(
                new Query<UmsMemberCollectSpuEntity>().getPage(params),
                new QueryWrapper<UmsMemberCollectSpuEntity>()
        );

        return new PageUtils(page);
    }

}