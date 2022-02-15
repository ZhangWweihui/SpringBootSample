package com.zwh.dubboprovider

import org.apache.dubbo.config.spring.context.annotation.EnableDubboConfig
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration

@SpringBootApplication(exclude=[DataSourceAutoConfiguration.class],scanBasePackages=["com.zwh.dubboprovider"])
@EnableDubboConfig
class DubboProviderApp {

    static void main(String[] args) {
        SpringApplication.run(DubboProviderApp.class, args)
    }
}
