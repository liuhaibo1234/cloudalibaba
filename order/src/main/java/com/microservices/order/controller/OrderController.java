package com.microservices.order.controller;


import com.microservice.common.orderApi.OrderService;
import com.microservices.order.foreignService.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
public class OrderController {

    @Autowired
    private OrderService orderService;

    @Autowired
    private UserService userService;

    @GetMapping("/sayHelloOrder")
    public  String  sayHelloOrder(){
        return orderService.sayHelloOrder();
    }

    @GetMapping("/sayHelloUser")
    public  String  sayHelloUser(){
        return userService.sayHelloUser();
    }
}
