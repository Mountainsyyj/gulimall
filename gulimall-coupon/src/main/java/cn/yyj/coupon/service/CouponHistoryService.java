package cn.yyj.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import cn.yyj.common.utils.PageUtils;
import cn.yyj.coupon.entity.CouponHistoryEntity;

import java.util.Map;

/**
 * 优惠券领取历史记录
 *
 * @author yyj
 * @email yyj@gmail.com
 * @date 2023-12-09 15:18:47
 */
public interface CouponHistoryService extends IService<CouponHistoryEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

