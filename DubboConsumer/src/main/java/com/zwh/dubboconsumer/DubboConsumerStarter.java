package com.zwh.dubboconsumer;

import com.zwh.dubboconsumer.service.ConsumerService;
import com.zwh.sdk.po.PersonImpl;
import org.apache.dubbo.config.spring.context.annotation.EnableDubboConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

/**
 * @Description
 * @Author 张炜辉
 * @Date 2019/6/16
 */
@SpringBootApplication(exclude= {DataSourceAutoConfiguration.class})
@EnableDubboConfig
@ComponentScan("com.zwh.dubboconsumer")
public class DubboConsumerStarter {

    public static void main(String[] args) {
        ConfigurableApplicationContext cac = SpringApplication.run(DubboConsumerStarter.class, args);
        ConsumerService consumerService = cac.getBean(ConsumerService.class);
        System.out.println(consumerService.sayHello("dubbo"));
        System.out.println(consumerService.sayHello2("dubbo"));
        PersonImpl person = new PersonImpl();
        person.setName("LittleCat");
        person.setAge(20);
        System.out.println(consumerService.testPojo(person));
    }
}
