package com.bootcampdemo.demo_sb_customer.Service;

import java.util.List;

import com.bootcampdemo.demo_sb_customer.entity.customerEntity;

public interface CustomerService {
  List<customerEntity> getCustomers();
  customerEntity createCustomer(customerEntity customerEntity);
}
