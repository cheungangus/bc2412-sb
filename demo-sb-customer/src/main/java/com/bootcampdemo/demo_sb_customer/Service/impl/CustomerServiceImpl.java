package com.bootcampdemo.demo_sb_customer.Service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bootcampdemo.demo_sb_customer.Service.CustomerService;
import com.bootcampdemo.demo_sb_customer.entity.customerEntity;
import com.bootcampdemo.demo_sb_customer.repository.customerRepository;


@Service
public class CustomerServiceImpl implements CustomerService {
  @Autowired
  private customerRepository customerRepository;

  @Override
  public List<customerEntity> getCustomers() {
    return this.customerRepository.findAll();
  }

  @Override
  public customerEntity createCustomer(customerEntity customerEntity) {
    return this.customerRepository.save(customerEntity);
  }
}