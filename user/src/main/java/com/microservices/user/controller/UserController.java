package com.microservices.user.controller;

import com.microservice.common.userApi.UserService;
import com.microservices.user.foreignService.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
public class UserController {

    @Autowired
    private UserService userService;
    @Autowired
    private OrderService orderService;

    @GetMapping("/sayHelloUser")
    public  String  sayHelloUser(){
        return userService.sayHelloUser();
    }

    @GetMapping("/sayHelloOrder")
    public  String  sayHelloOrder(){
        return orderService.sayHelloOrder();
    }
}
