package com.bootcampdemo.demo_sb_customer.Controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import com.bootcampdemo.demo_sb_customer.entity.OrderEntity;

public interface OrderOperation {
    
    // localhost:8100/order?cid=2
    @PostMapping(value = "/order")
    OrderEntity createOrder(@RequestParam(value = "cid")Long customerId,
    @RequestBody OrderEntity orderEntity
    ) ;
}
