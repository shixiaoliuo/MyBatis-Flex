package com.lxl.mybatisflex;

import com.lxl.mybatisflex.entity.User;
import com.lxl.mybatisflex.service.UserService;
import lombok.RequiredArgsConstructor;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@SpringBootTest
//@RequiredArgsConstructor
class MyBatisFlexApplicationTests {

    @Autowired
    private UserService userService;

    @Test
    void save() {
        User user = new User();
        user.setName("张三");
        user.setAge(18);
        userService.save(user);
    }

    @Test
    void select() {
        System.out.println("userService.list() = " + userService.list());
    }

    @Test
    void delete() {
        userService.removeById(22472383963000135L);
    }

    @Test
    void update() {
        User user = new User();
        user.setName("李四");
        user.setAge(18);
        user.setId(22473989304000170L);
        userService.updateById(user);
    }

}
