package com.example.diyu.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

//@EnableAutoConfiguration
@ComponentScan(basePackages={"com.example.diyu.demo.entity"})
@SpringBootApplication
public class SpringbootBookSystemApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringbootBookSystemApplication.class, args);
    }
}

//@ComponentScan(basePackages={"com.example.diyu.demo.entity"})
//@SpringBootApplication
//public class SpringbootBookSystemApplication{
//    public static void main(String[] args){
//        SpringApplication.run(SpringbootBookSystemApplication.class,args);
//    }
//}







