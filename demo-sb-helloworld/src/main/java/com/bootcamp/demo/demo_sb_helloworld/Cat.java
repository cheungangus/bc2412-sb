package com.bootcamp.demo.demo_sb_helloworld;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter     // Serialization (objec - Json)
@AllArgsConstructor

public class Cat {
    private String name;
    private int age;
}
