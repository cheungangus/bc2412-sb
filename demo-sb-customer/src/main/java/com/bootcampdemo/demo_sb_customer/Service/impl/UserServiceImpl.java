package com.bootcampdemo.demo_sb_customer.Service.impl;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.security.SecurityProperties.User;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;


@Service
public class UserServiceImpl implements userService{
    
    @Autowired
    private RestTemplate restTemplate;
    @Value("${api.josonplaceholder.domain}")
    private String domain;

    @Value("${api.jsonplaceholder.endpoints.users}")
    private String usersEndpoint;

    @Override
    public List<User> getUsers(){
        // String url = "https://jsonplaceholder.typicode.com/users";
        String url = UriComponentsBuilder.newInstance()
        .scheme("https")
        .host(domain)
        .path(usersEndpoint)
        .build()
        .toUriString();
        System.out.println("url=" + url );

        List<UserDto> userDtos = 
        return Arrays.asList(this.restTemplate.getForObject(url, User[].class));
        // clear DB
        this.userRepository.deleteAll();
        this.companyRepository.deleteAll();
        this.geoRepository.deleteAll();
        this.addressRepository.deleteAll();
        
        // Save DB(procedures)
        userDtos.stream().forEach(e-> {
            UserEntity userEntity = this.userRepository.save(this.entityMapper.map(e));

            AddressEntity addressEntity = this.entityMapper.map(e.getAddress());
            addressEntity setUserEntity (userEntity);
            this.addressRepository.save(addressEntity);

            CompanyEntity CompanyEntity = this.entityMapper.map(e.getCompany());
            CompanyEntity setUserEntity (userEntity);
            this.companyRepository.save(CompanyEntity);

            GeoEntity GeoEntity = this.entityMapper.map(e.getGeo());
            GeoEntity setUserEntity(userEntity);
            this.geoRepository.save(GeoEntity);
        });
        return null;
    }
}
