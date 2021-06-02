package com.x.shop.service;
import com.x.shop.entity.Discount;

import java.util.List;

public interface DiscountService {
	/**
	 * 添加一个优惠活动
	 */
	Boolean addDiscount(Discount discount);


	/**
	 * 删除一个优惠活动
	 */
	Boolean deleteDiscount(String did);


	/**
	 * 根据一个优惠券代码查找优惠活动
	 */
	Discount findDiscountByCoupon(String coupon);

	/**
	 * 根据did查找优惠活动
	 * 可能不会用到
	 */
	Discount findDiscountByDid(String did);


	/**
	 */
	List<Discount> getDiscounts();
	List<Discount> getDiscounts(Integer offset, Integer row_count);
}
