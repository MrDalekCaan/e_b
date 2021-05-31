package com.x.shop.service;

import com.x.shop.dao.UserDao;
import com.x.shop.dao.UserDaoImpl;
import com.x.shop.entity.Address;
import com.x.shop.entity.User;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class UserServiceImpl implements UserService{
    private UserDao dao = new UserDaoImpl();
    @Override
    public Boolean insert(User user) {
        try {
            return dao.insert(user) > 0;
        } catch (SQLException throwables) {
            throwables.printStackTrace();
            return false;
        }
    }

    @Override
    public List<User> getAllUser() {
        try {
            return dao.getAllUser();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
            return new ArrayList<>();
        }
    }

    @Override
    public User getUserByUid(String uid) {
        return null;
    }

    @Override
    public Boolean deleteUser(String uid) {
        return null;
    }

    @Override
    public Boolean editUser(User user) {
        return null;
    }

    @Override
    public Boolean insertAddress(Address address) {
        try {
            return dao.insertAddress(address) > 0;
        } catch (SQLException throwables) {
            throwables.printStackTrace();
            return false;
        }
    }


    @Override
    public Boolean register(User user) {
        return null;
    }

    @Override
    public Boolean activate(String uid) {
        return null;
    }

}
