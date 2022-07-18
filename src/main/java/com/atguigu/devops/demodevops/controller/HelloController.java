package com.atguigu.devops.demodevops.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author Kingstu
 * @date 2022/7/18 20:08
 */
@RestController
public class HelloController {

    @GetMapping("/")
    public String hello(){

        String format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());

        return "你好:张三:现在是:"+format;
    }
}
