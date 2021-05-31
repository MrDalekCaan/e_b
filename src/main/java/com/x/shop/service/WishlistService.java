package com.x.shop.service;

import com.x.shop.entity.Wish;

import java.util.List;

public interface WishlistService {

	Boolean insert(Wish wish);


	/**
	 * 根据wid查询wish
	 */
	Wish findByWid(String wid);

	/**
	 * 根据uid和pid查询wish
	 * findByUidAndPid和findByWid都可以唯一确定一个心愿
	 */
	Wish findByUidAndPid(String uid, String pid);

	Boolean deleteByWid(String wid);

	/**
	 * 根据wid修改心愿
	 * @param wish
	 * @return
	 */
	Boolean editWish(Wish wish);

	/**
	 * 查找属于user的所有心愿
	 * @param uid
	 * @return
	 */
	List<Wish> findByUid(String uid);

}
