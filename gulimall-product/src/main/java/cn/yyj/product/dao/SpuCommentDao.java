package cn.yyj.product.dao;

import cn.yyj.product.entity.SpuCommentEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品评价
 * 
 * @author yyj
 * @email yyj@gmail.com
 * @date 2023-12-09 15:03:13
 */
@Mapper
public interface SpuCommentDao extends BaseMapper<SpuCommentEntity> {
	
}
