package com.exampleboot.demo_restful;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication //@SpringBootConfiguration + @EnableAutoConfiguration + @ComponentScan
// @ComponentScan -> Serach the whole project , check if any @Controller, @Service, @Repository, @Configuration,
// @Controller, @Service, @Repository, @Configuration are a type of Component
public class DemoRestfulApplication {

	public static ConfigurableApplicationContext context;
	public static void main(String[] args) {
		context = SpringApplication.run(DemoRestfulApplication.class, args);
	}

}
