package cn.yyj.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import cn.yyj.common.utils.PageUtils;
import cn.yyj.product.entity.SkuInfoEntity;

import java.util.Map;

/**
 * sku信息
 *
 * @author yyj
 * @email yyj@gmail.com
 * @date 2023-12-09 15:03:13
 */
public interface SkuInfoService extends IService<SkuInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

