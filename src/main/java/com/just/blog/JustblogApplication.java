package com.just.blog;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author justnow
 * Created on 2021-05-27
 * Description
 */

@MapperScan("com.just.blog.mapper") //在该包下扫描mapper
@SpringBootApplication
public class JustblogApplication {
    public static void main(String[] args) {
        SpringApplication.run(JustblogApplication.class, args);
    }
}
