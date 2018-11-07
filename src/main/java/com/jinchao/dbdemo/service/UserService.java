package com.jinchao.dbdemo.service;

import com.jinchao.dbdemo.entity.User;

public interface UserService {
    User findByEmail(String email);

    User findById(String id);

    User findByCellPhone(String cellPhone);

    User save(User user);
}
