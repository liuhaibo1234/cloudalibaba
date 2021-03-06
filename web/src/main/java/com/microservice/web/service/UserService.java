package com.microservice.web.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value = "alibaba-server-user")
public interface UserService {
    @GetMapping("/userTestMethod")
    public String sayHello();
}
