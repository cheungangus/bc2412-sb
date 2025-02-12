package com.bootcampdemo.demo_sb_customer.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bootcampdemo.demo_sb_customer.entity.UserEntity;

@Repository
public interface GeoRepository extends JpaRepository<UserEntity,Long> {
    
}
