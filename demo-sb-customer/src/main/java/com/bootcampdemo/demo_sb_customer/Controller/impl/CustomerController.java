package com.bootcampdemo.demo_sb_customer.Controller.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.bootcampdemo.demo_sb_customer.Controller.CustomerOperation;
import com.bootcampdemo.demo_sb_customer.Service.CustomerService;
import com.bootcampdemo.demo_sb_customer.codewave.ApiResp;
import com.bootcampdemo.demo_sb_customer.codewave.SysCode;
import com.bootcampdemo.demo_sb_customer.entity.customerEntity;

@RestController
public class CustomerController implements CustomerOperation {
  @Autowired
  private CustomerService customerService;

  @Override
  public ApiResp<List<customerEntity>> getCustomers() {
    List<customerEntity> customerEntities = this.customerService.getCustomers();
    return ApiResp.<List<customerEntity>>builder()
    .syscode(SysCode.OK)
    .data(customerEntities)
    .build();
  }
  @Override
  public ApiResp<customerEntity> createCustomer(customerEntity customerEntity) {
    customerEntity ServiceResult = this.customerService.createCustomer(customerEntity);
    return ApiResp.<customerEntity>builder()
    .syscode(SysCode.OK)
    .data(ServiceResult)
    .build();
  }
}