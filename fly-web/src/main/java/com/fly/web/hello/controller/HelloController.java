package com.fly.web.hello.controller;

import com.sun.deploy.net.HttpResponse;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String hello(HttpServletRequest request){
        request.getSession().setAttribute("test","tset");
        return "hello world";
    }

}
