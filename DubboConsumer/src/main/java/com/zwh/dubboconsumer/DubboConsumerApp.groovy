package com.zwh.dubboconsumer

import org.apache.dubbo.config.spring.context.annotation.EnableDubboConfig
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration

@SpringBootApplication(exclude = [DataSourceAutoConfiguration.class],
        scanBasePackages = ["com.zwh.dubboconsumer"])
@EnableDubboConfig
class DubboConsumerApp {

    static void main(String[] args) {
        SpringApplication.run(DubboConsumerApp.class, args)
    }
}
