package com.exampleboot.demo_restful.controller.impl;

import org.springframework.web.bind.annotation.RestController;

import com.exampleboot.demo_restful.DemoRestfulApplication;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;


@RestController
public class BeanController {
    @GetMapping(value = "/beans")
    public List<String> getBeans() {
        return Arrays.asList(DemoRestfulApplication.context.getBeanDefinitionNames());
    }
    
}
