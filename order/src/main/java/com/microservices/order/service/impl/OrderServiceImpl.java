package com.microservices.order.service.impl;

import com.microservice.common.orderApi.OrderService;
import org.springframework.stereotype.Service;

@Service
public class OrderServiceImpl implements OrderService {
    @Override
    public String sayHelloOrder() {
        return "hello order";
    }
}
