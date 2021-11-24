package com.microservice.user.impl;

import com.microservice.user.api.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Override
    public String testMethod() {
        return "hello";
    }
}
