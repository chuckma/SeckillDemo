package org.seckill.dao;

import java.util.Date;
import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.seckill.entity.Seckill;

public interface SeckillDao {
	/**
	 * 减库存
	 * @param seckillId
	 * @param killTime
	 * @return 如果影响下行数>1，表示更新记录的行数
	 */
	int reduceNumber(@Param("seckillId")long seckillId,@Param("killTime")Date killTime);
	/**
	 * 根据ID查询
	 * @param seckillId
	 * @return
	 */
	Seckill queryById(long seckillId);
	/**
	 * 根据偏移量查询秒杀商品数量
	 * @param offet 偏移量
	 * @param limit
	 * @return
	 */
	List<Seckill> queryAll(@Param("offset")int offset,@Param("limit")int limit);
	
}
