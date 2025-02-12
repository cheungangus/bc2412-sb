package com.bootcampdemo.demo_sb_customer.Service.impl;

import java.lang.StackWalker.Option;
import java.util.Optional;

import org.hibernate.boot.model.source.spi.Orderable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bootcampdemo.demo_sb_customer.codewave.BusinessException;
import com.bootcampdemo.demo_sb_customer.codewave.syscode;
import com.bootcampdemo.demo_sb_customer.entity.OrderEntity;
import com.bootcampdemo.demo_sb_customer.repository.customerRepository;

@Service
public class OrderServiceImpl implements Orderable {
  @Autowired
  private customerRepository customerRepository;
  @Autowired
  private OrderRepository orderRepository;

  // if customer id not found, throw new BusinessException("Customer ID not found.")
  @Override
  public OrderEntity createOrder(Long customerId customerEntity customerEntity) {
    customerEntity customerEntity = this.customerRepository.findById(customerId)
        .orElseThrow(() -> BusinessException.of(syscode.ID_NOT_FOUND));

    orderEntity.setCustomerEntity(customerEntity);
    // Save orderEntity to DB
    return this.orderRepository.Save(orderEntity);
    }
}
