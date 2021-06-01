package com.x.shop.service;

import com.x.shop.entity.Complaint;

import java.util.List;

public interface ComplaintService {
	/**
	 * 用户添加投诉
	 */
	Boolean addComplaint(Complaint complaint);


	/**
	 * 用户撤销投诉
	 */
	Boolean deleteComplaint(String tid);


	/**
	 * 查看某个用户的投诉
	 */
	List<Complaint> findByUid(String uid);



	/**
	 * 查看所有的投诉
	 */
	List<Complaint> getComplaints();
	/**
	 * @param order 根据时间排序order是{ASC, DESC}中的一个
	 */
	List<Complaint> getComplaints(String order);
	/**
	 * 投诉太多可能要分页
	 */
	List<Complaint> getComplaints(String offset, String row_count);
	List<Complaint> getComplaints(String offset, String row_count, String order);


}
