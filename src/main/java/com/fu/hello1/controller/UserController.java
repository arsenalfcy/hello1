package com.fu.hello1.controller;

import com.fu.hello1.entity.User;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {

    @GetMapping("/user/{id}")
    public String getUserById(@PathVariable int id){
        System.out.println(id);
        return "根据ID获取用户信息";
    }

    @PostMapping("/user")
    public String save(User user){
        return "添加用户"+user;
    }

    @PutMapping
    public String update(User user){
        return "更新用户";
    }

    @DeleteMapping
    public String deleteById(@PathVariable int id){
        System.out.println(id);
        return "根据ID删除用户";
    }
}
