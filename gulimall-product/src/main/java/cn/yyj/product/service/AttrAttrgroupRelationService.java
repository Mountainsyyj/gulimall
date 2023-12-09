package cn.yyj.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import cn.yyj.common.utils.PageUtils;
import cn.yyj.product.entity.AttrAttrgroupRelationEntity;

import java.util.Map;

/**
 * 属性&属性分组关联
 *
 * @author yyj
 * @email yyj@gmail.com
 * @date 2023-12-09 15:03:13
 */
public interface AttrAttrgroupRelationService extends IService<AttrAttrgroupRelationEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

