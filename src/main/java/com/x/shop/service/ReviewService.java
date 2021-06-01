package com.x.shop.service;

import com.x.shop.entity.Review;

import java.util.List;

public interface ReviewService {
	/**
	 * 新增一个评论或者对评论进行评论, 这两个都是通过这个接口完成
	 * review.uid代表了是谁评论，review.type代表了是对什么评论{商品:0, 博客:1, 评论:2}
	 * 相对应的review.reply_to里面的就是pid, bid, rid
	 */
	Boolean addReview(Review review);


	/**
	 * 肯定会有用户想删评论吧
	 */
	Boolean deleteReview(String rid);


	/**
	 * 修改评论
	 */
	Boolean editReview(Review review);


	/*
	 * 页面上的update_time，用户之类的都会在下面几个接口返回的review中
	 */


	/**
	 * 查找用户的评论
	 */
	List<Review> findByUid(String uid);
	List<Review> findByUid(String uid, String order);
	List<Review> findByUid(String uid, String offset, String row_count);
	List<Review> findByUid(String uid, String offset, String row_count, String order);


	/**
	 * 查找指定商品的评论
	 */
	List<Review> findByPid(String pid);
	List<Review> findByPid(String pid, String order);
	List<Review> findByPid(String pid, String offset, String row_count);
	List<Review> findByPid(String pid, String offset, String row_count, String order);


	/**
	 * 查找blog的评论
	 */
	List<Review> findByBid(String bid);
	List<Review> findByBid(String bid, String order);
	List<Review> findByBid(String bid, String offset, String row_count);
	List<Review> findByBid(String bid, String offset, String row_count, String order);


	/**
	 * 查找评论的评论
	 */
	List<Review> findByRid(String rid);
	List<Review> findByRid(String rid, String order);
	List<Review> findByRid(String rid, String offset, String row_count);
	List<Review> findByRid(String rid, String offset, String row_count, String order);
}
