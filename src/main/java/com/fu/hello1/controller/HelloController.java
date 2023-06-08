package com.fu.hello1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
@GetMapping("/hello")
    public String hello(String nn,String age) {
    return    "你好 "+nn+" 你今年"+age+"岁了";
}
}
