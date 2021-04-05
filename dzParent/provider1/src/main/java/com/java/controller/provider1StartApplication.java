package com.java.controller;
/*package com.java.controller;*/

import com.alibaba.dubbo.config.annotation.Service;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author 珏
 * @description 暂无
 * @time 2021/2/211:28
 */

@SpringBootApplication(scanBasePackages = "com.java.*")
public class provider1StartApplication {
    public static void main(String[] args) {
        SpringApplication.run(provider1StartApplication.class);
    }
}
