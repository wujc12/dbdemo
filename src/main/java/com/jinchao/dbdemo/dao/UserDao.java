package com.jinchao.dbdemo.dao;

import com.jinchao.dbdemo.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserDao extends JpaRepository<User, Long> {

    User findByEmail(String email);

    User findById(String id);

    User findByCellPhone(String cellPhone);

}
