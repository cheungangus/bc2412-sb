package com.bootcampdemo.demo_sb_customer.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bootcampdemo.demo_sb_customer.entity.UserEntity;

public interface AddressRepository extends JpaRepository<UserEntity,Long>  {
    
}
