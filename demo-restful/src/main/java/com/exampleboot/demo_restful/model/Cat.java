package com.exampleboot.demo_restful.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Cat {
    // wrapper class for serialization / deserialization
    private Long id; // 
    private String name;
    private Integer age;
}
