package com.restapi.restproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//SpringBoot is not a Standalone framework it is built on top of Spring framework 
//@SpringBootApplication annotation is a combination of @ComponentScan(This is a spring framework annotation)+@EnableAutoConfiguration+@Configuration
//@ComponentScan -> When you use @ComponentScan, you are telling Spring, "Go look in these packages and find classes that are annotated to be Spring beans."
//@EnableAutoConfiguration attempts to guess and configure the beans which you may need, based on the classpath.By looking the package dependencies you have specified, SpringBoot will automatically create beans.
//@Configuration -> When you put @Configuration on a class, you are telling Spring, "This class contains instructions on how to create and configure some objects (beans) that I need for my application."
public class RestprojectApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestprojectApplication.class, args);
	}

}
