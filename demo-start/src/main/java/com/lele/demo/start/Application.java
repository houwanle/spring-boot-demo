package com.lele.demo.start;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author: lele
 * @date: 2021/8/24 7:21
 * @description:
 */
@SpringBootApplication
@ComponentScan(basePackages ={"com.lele.demo.*" })
@MapperScan("com.lele.demo.dao")
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
