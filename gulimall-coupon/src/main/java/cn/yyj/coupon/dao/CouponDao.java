package cn.yyj.coupon.dao;

import cn.yyj.coupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author yyj
 * @email yyj@gmail.com
 * @date 2023-12-09 15:18:47
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
