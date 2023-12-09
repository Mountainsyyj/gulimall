package cn.yyj.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import cn.yyj.common.utils.PageUtils;
import cn.yyj.product.entity.SkuImagesEntity;

import java.util.Map;

/**
 * sku图片
 *
 * @author yyj
 * @email yyj@gmail.com
 * @date 2023-12-09 15:03:14
 */
public interface SkuImagesService extends IService<SkuImagesEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

