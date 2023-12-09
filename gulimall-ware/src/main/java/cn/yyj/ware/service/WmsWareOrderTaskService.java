package cn.yyj.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import cn.yyj.common.utils.PageUtils;
import cn.yyj.ware.entity.WmsWareOrderTaskEntity;

import java.util.Map;

/**
 * 库存工作单
 *
 * @author yyj
 * @email yyj@gmail.com
 * @date 2023-12-09 15:28:04
 */
public interface WmsWareOrderTaskService extends IService<WmsWareOrderTaskEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

