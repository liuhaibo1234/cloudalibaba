package com.microservices.user.foreignService;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value = "alibaba-service-order")
public interface OrderService {
    @GetMapping("/sayHelloOrder")
    public  String  sayHelloOrder();
}
