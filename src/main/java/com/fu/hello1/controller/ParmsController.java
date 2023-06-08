package com.fu.hello1.controller;

import com.fu.hello1.entity.User;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ParmsController {

    @RequestMapping(value = "/postTest",method = RequestMethod.POST)
    public String postTest(String username,String password){
        System.out.println("username:"+username);
        System.out.println("password:"+password);
        return "POST请求";
    }

    @RequestMapping(value = "/postTest2",method = RequestMethod.POST)
    public String postTest2(@RequestBody User user){
        System.out.println("username:"+user.getUsername());
        System.out.println("password:"+user.getPassword());
        return "POST请求";
    }

    @RequestMapping(value = "/postTest3",method = RequestMethod.POST)
    public String postTest3( User user){
        System.out.println(user);
        return "POST请求";
    }
}
