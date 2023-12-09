package cn.yyj.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import cn.yyj.common.utils.PageUtils;
import cn.yyj.order.entity.OmsPaymentInfoEntity;

import java.util.Map;

/**
 * 支付信息表
 *
 * @author yyj
 * @email yyj@gmail.com
 * @date 2023-12-09 15:24:44
 */
public interface OmsPaymentInfoService extends IService<OmsPaymentInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

