package com.microservice.user.controller;

import com.microservice.user.api.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
public class UserController {

    @Autowired
    private UserService userService;
    @RequestMapping("/testMethod")
    public String sayHello(){
        return userService.testMethod();
    }
}
