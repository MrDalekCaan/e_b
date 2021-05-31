package com.x.shop.dao;

import com.x.shop.entity.Address;
import com.x.shop.entity.User;

import java.sql.SQLException;
import java.util.List;

public interface UserDao {

    Integer insert(User user) throws SQLException;

    Integer insertAddress(Address address) throws SQLException;

    List<User> getAllUser() throws SQLException;
}
