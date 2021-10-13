package com.phisoft.jacocodemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JacocodemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(JacocodemoApplication.class, args);

        System.out.println(" yes jacoco ");
    }

}
