package com.bootcampdemo.demo_sb_customer.Controller;

import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.bootcampdemo.demo_sb_customer.codewave.ApiResp;
import com.bootcampdemo.demo_sb_customer.entity.customerEntity;

public interface CustomerOperation {
  @GetMapping(value = "/customers")
  ApiResp<List<customerEntity>> getCustomers();
  
  @PostMapping(value = "/customer")
  customerEntity createCustomer(@RequestBody customerEntity customerEntity);
}