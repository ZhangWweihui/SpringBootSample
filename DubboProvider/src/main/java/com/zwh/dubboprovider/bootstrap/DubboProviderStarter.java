package com.zwh.dubboprovider.bootstrap;

import org.apache.dubbo.config.spring.context.annotation.EnableDubboConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

/**
 * @Description
 * @Author 张炜辉
 * @Date 2019/6/16
 */
@SpringBootApplication(exclude= {DataSourceAutoConfiguration.class})
@ComponentScan("com.zwh.dubboprovider")
@EnableDubboConfig
public class DubboProviderStarter {

    public static void main(String[] args) {
        SpringApplication.run(DubboProviderStarter.class, args);
    }
}
