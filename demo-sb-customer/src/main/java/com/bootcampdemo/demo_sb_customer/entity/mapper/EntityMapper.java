package com.bootcampdemo.demo_sb_customer.entity.mapper;

import org.springframework.stereotype.Component;

import com.bootcampdemo.demo_sb_customer.Model.dto.UserDto;
import com.bootcampdemo.demo_sb_customer.dto.UserDTO;
import com.bootcampdemo.demo_sb_customer.entity.AddressEntity;
import com.bootcampdemo.demo_sb_customer.entity.CompanyEntity;
import com.bootcampdemo.demo_sb_customer.entity.GeoEntity;
import com.bootcampdemo.demo_sb_customer.entity.UserEntity;

@Component
public class EntityMapper {
    public UserEntity map(UserDto dto){
        return UserEntity.builder()
        .email(dto.getEmail())
        .name(dto.getName())
        .username(dto.getUsername())
        .website(dto.getWebsite())
        .phone(dto.getPhone())
        .build();

    }
    public AddressEntity map(UserDto.Address address){
        return AddressEntity.builder()
        .street(address.getStreet())
        .city(address.getCity())
        .suite(address.getSuite())
        .zipcode(address.getZipcode())
        .build();
    }
    public CompanyEntity map(UserDto.Company company){
        return CompanyEntity.builder()
        .catchPhrase(company.getCatchPhrase())
        .bs(company.getBs())
        .name(company.getName())
        .build();
    }
    public GeoEntity map(UserDto.Geo geo){
        return GeoEntity.builder()
        .id(geo.getId())
        .latitude(geo.getLatitude())
        .longitude(geo.getLongitude())
        .build();
    }
        
    }
    


