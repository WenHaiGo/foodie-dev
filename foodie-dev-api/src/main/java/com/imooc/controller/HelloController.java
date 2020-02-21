package com.imooc.controller;

import jdk.nashorn.internal.ir.ReturnNode;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther: wwh
 * @Date: 2020-02-21 01:35
 * @Description:
 */
@RestController
public class HelloController {
    @GetMapping("/hello")
    public Object hello(){
        return "hello  world";
    }

}
