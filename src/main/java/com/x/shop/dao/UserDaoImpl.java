package com.x.shop.dao;

import com.x.shop.entity.User;
import com.x.utils.QueryrunnerUtil;
import com.x.shop.entity.Address;
import org.apache.commons.dbutils.DbUtils;
import org.apache.commons.dbutils.handlers.BeanListHandler;


import java.sql.SQLException;
import java.util.List;

public class UserDaoImpl implements UserDao{

    @Override
    public Integer insert(User user) throws SQLException {
        String sql = "insert into user value(?,?,?,?,?)";
        Object[] params = {user.getUid(), user.getUsername(), user.getEmail(),
            user.getPassword(), user.getPrivilege()};
        return QueryrunnerUtil.getQueryrunner().update(sql, params);
    }


    @Override
    public Integer insertAddress(Address address) throws SQLException {
        String sql = "insert into address value(?,?,?,?,?,?,?,?,?,?,?)";
        Object[] params = {address.getAid(), address.getUid(),
            address.getFirst_name(), address.getLast_name(),
            address.getEmail(), address.getPhone(),
            address.getCountry(), address.getStreet_address(),
            address.getCity(), address.getZip(),
            address.getState()};
        return QueryrunnerUtil.getQueryrunner().update(sql, params);
    }

    @Override
    public List<User> getAllUser() throws SQLException {
        String sql = "select * from user";
        return QueryrunnerUtil.getQueryrunner().query(sql, new BeanListHandler<>(User.class));
    }
}
