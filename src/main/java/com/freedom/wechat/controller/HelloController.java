package com.freedom.wechat.controller;

import org.junit.Test;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by freedom on 2019/12/2.
 */
@Controller
@RequestMapping("/hw")
public class HelloController {


    @RequestMapping("/hello")
    @ResponseBody
    public String hello(){
        return "Hello,SpringBoot.";
    }


    @Test
    public void print(){
        System.out.println("test ");
    }
}
