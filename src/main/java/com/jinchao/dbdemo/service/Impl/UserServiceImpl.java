package com.jinchao.dbdemo.service.Impl;

import com.jinchao.dbdemo.dao.UserDao;
import com.jinchao.dbdemo.entity.User;
import com.jinchao.dbdemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public User findByEmail(String email) {
        return userDao.findByEmail(email);
    }

    @Override
    public User findById(String id) {
        return userDao.findById(id);
    }

    @Override
    public User findByCellPhone(String cellPhone) {
        return userDao.findByCellPhone(cellPhone);
    }

    @Override
    public User save(User user) {
        return userDao.save(user);
    }
}
