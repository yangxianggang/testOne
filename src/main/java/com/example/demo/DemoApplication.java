package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

/** 一 多环境的配置 （测试环境 开发环境  预生产环境 生产环境）
 *
 * 二 springBoot 项目的打包流程
 *
 */
@SpringBootApplication(exclude= {DataSourceAutoConfiguration.class})
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

}
