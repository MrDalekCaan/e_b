package com.x.shop.service;

import com.x.shop.entity.Order;

import java.util.List;

public interface OrderService {

	/**
	 * 添加一个新的订单，用户下单的时候添加。
	 */
	Boolean addOrder(Order order);


	/**
	 * 修改订单信息
	 */
	Boolean editOrder(Order order);

	/**
	 * 后台查询订单信息
	 */
	List<Order> getOrders();
	List<Order> getOrders(Integer offset, Integer row_count);


	/**
	 * 查询某个用户的订单
	 */
	List<Order> findByUid(String uid);
	List<Order> findByUid(String uid, Integer offset, Integer row_count);

}