package com.microservices.user.service.impl;


import com.microservice.common.userApi.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Override
    public String sayHelloUser() {
        return "hello,user";
    }
}
