package cn.tjpu.pilihub.controller;

import cn.tjpu.pilihub.dao.UserMapper;
import cn.tjpu.pilihub.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author FY
 * @Date 2021/10/30 10:15
 * @Version 1.0
 */

@RestController
public class UserController {
    @Autowired
    private UserMapper userMapper;

    @GetMapping("/user")
    public List<User> getAllUsers() throws Exception{
        List<User> users = userMapper.selectList(null);
        return users;
    }

}
