package com.x.shop.service;

import com.x.shop.entity.Blog;

import java.util.List;

public interface BlogService {
	
	/**
	 * 查找用户uid的所有blog
	 * 可能还要来个分页？后面两个函数是用来分页的
	 */
	List<Blog> findByUid(String uid);
	/**
	 * @param order 根据时间排序order是{"ASC", "DESC"}中的一个
	 */
	List<Blog> findByUid(String uid, String order);
	List<Blog> findByUid(String uid, Integer offset, Integer row_count);
	List<Blog> findByUid(String uid, Integer offset, Integer row_count, String order);



	/**
	 * 根据tag进行查询所有blog
	 * 可能也要来个分页？后面两个函数是用来分页的
	 * 
	 * @return 页面上要显示的评论者，评论类型什么的都在返回的blog中
	 */
	List<Blog> findByTag(String tag);
	List<Blog> findByTag(String tag, String order);
	/**
	 * @param row_count SELECT * FROM Blog WHERE tag=`tag` LIMIT offset, row_count ORDER BY `order`
	 */
	List<Blog> findByTag(String tag, Integer offset, Integer row_count);
	List<Blog> findByTag(String tag, Integer offset, Integer row_count, String order);




	/**
	 * bid是用来删除更新blog的内容的，bid是一个32位的字符串，一般不会有人想通过bid查文章吧
	 * 不过还是留着可能有用
	 */
	Blog findByBid(String bid);


	/**
	 * 有时候可能需要修改blog。但是不能修改bid，这个可能也用不到但也还是留着吧
	 */
	Boolean editBlog(Blog blog);


	/**
	 * 可能还要删？
	 */
	Boolean deleteBlog(String bid);


	/**
	 * 添加一个新blog
	 */
	Boolean addBlog(Blog blog);


	

	/*
	 * blog不是评论所以也没有评论里面的类型
	 */

}
