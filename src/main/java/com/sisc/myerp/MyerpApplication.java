package com.sisc.myerp;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.sisc.myerp.dao")
@SpringBootApplication
public class MyerpApplication {

    public static void main(String[] args) {
        SpringApplication.run(MyerpApplication.class, args);
    }

}
