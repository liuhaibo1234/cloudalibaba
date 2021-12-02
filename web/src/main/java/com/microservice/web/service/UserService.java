package com.microservice.web.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value = "alibaba-nacos-discovery-server")
public interface UserService {
    @GetMapping("/userTestMethod")
    public String sayHello();
}
