package com.bootcampdemo.demo_sb_customer.Controller.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.bootcampdemo.demo_sb_customer.Controller.OrderOperation;
import com.bootcampdemo.demo_sb_customer.Service.OrderService;
import com.bootcampdemo.demo_sb_customer.codewave.ApiResp;
import com.bootcampdemo.demo_sb_customer.entity.OrderEntity;

@RestController

public class OrderController implements OrderOperation {
  @Autowired
  private OrderService orderService;

  @Override
  public ApiResp<orderEntity> createOrder(Long customerId,
      OrderEntity orderEntity) {
    OrderEntity serviceResult =
        this.orderService.createOrder(customerId, orderEntity);
    return ApiResp.<OrderEntity>builder().syscode(SysCode.OK)
        .data(serviceResult).build();
  }
}