package com.java.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author 珏
 * @description 暂无
 * @time 2021/2/211:40
 */
@SpringBootApplication(scanBasePackages = "com.java.*")
public class ConsumerStartController {
    public static void main(String[] args) {
        SpringApplication.run(ConsumerStartController.class);
    }
}
