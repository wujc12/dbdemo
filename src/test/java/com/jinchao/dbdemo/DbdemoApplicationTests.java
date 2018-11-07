package com.jinchao.dbdemo;

import com.jinchao.dbdemo.entity.User;
import com.jinchao.dbdemo.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DbdemoApplicationTests {

    @Autowired
    UserService userService;

    @Test
    public void contextLoads() {
    }

    @Test
    public void testUserService() {

        /*
        User user = userService.findByEmail("wujc12@live.com");
        System.out.println("User name: " + user.getName()); */

        User user = new User("Jinchao", "Email@Email", "CellPhone", "ClassNumber");
        userService.save(user);

    }

}
