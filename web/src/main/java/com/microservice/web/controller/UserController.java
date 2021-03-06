package com.microservice.web.controller;


import com.microservice.web.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
public class UserController {

    @Autowired
    private UserService userService;


    @GetMapping("/sayHello")
    public  String  testMethod(){
        return userService.sayHello();
    }
}
