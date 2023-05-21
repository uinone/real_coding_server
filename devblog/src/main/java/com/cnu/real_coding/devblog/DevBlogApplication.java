package com.cnu.real_coding.devblog;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EntityScan(basePackages = "com.cnu.real_coding")
@EnableJpaAuditing
@SpringBootApplication
@ComponentScan(basePackages = "com.cnu.real_coding")
public class DevBlogApplication {

    public static void main(String[] args) {
        SpringApplication.run(DevBlogApplication.class, args);
    }

}
