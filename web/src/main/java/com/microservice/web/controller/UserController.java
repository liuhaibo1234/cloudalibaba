package com.microservice.web.controller;

import com.microservice.common.userApi.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
public class UserController {

    @Autowired
    private UserService userService;


    @GetMapping("/userTestMethod")
    public  String  testMethod(){
        return userService.testMethod();
    }
}
