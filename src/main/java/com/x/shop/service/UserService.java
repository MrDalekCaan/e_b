package com.x.shop.service;

import com.x.shop.entity.Address;
import com.x.shop.entity.User;

import java.util.List;

public interface UserService {

    // -----start 用户注册------

    /**
     * @param user 新用户
     * @return true or false 代表成功或失败
     */
    Boolean register(User user);

    /**
     * 激活码就是用户的uid
     * @param uid 激活码
     * @return true or false 代表成功或失败
     * 
     */
    Boolean activate(String uid); // 激活码就是uid

    // ----end 用户注册-------





    // ----start 用户信息----
    /**
     * 获取所有的用户
     */
    List<User> getUsers();
    List<User> getUsers(Integer offset, Integer row_count);


    /**
     * 获取单个用户
     * @return null:未找到用户, 如果找到就返回一个user
     */
    User findUserByUid(String uid);


    /**
     * 根据uid删除用户
     * @return true or false
     */
    Boolean deleteUser(String uid);


    /**
     * 修改user中的信息
     * @param user 根据user中的uid找到对应的user，然后修改信息
     */
    Boolean editUser(User user);
    // ----end 用户信息


    // ----start 用户地址管理
    Boolean addAddress(Address address);

    Boolean editAddress(Address address);

    Boolean deleteAddress(String aid);

    List<Address> findAddressByUid(String uid);
    //----end 用户地址管理

}
