package com.vtn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@SpringBootApplication
@ServletComponentScan
public class SpringBootJspApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootJspApplication.class, args);
    }

}
