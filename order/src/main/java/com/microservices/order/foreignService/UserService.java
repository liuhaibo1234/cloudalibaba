package com.microservices.order.foreignService;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value = "alibaba-server-user")
public interface UserService {
    @GetMapping("/sayHelloUser")
    public String sayHelloUser();
}
