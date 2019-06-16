package com.zwh.dubboconsumer.service;

import com.zwh.sdk.Person;
import com.zwh.sdk.UserServiceBO;
import org.apache.dubbo.config.annotation.Reference;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.stereotype.Component;

/**
 * @Description
 * @Author 张炜辉
 * @Date 2019/6/16
 */
@Component
public class ConsumerService {

    @Reference(group = "dubbo", interfaceClass = UserServiceBO.class, version = "1.0.0", timeout = 10000)
    private UserServiceBO userServiceBO;

    public String sayHello(String name) {
        return userServiceBO.sayHello(name);
    }

    public String sayHello2(String name) {
        return userServiceBO.sayHello2(name);
    }

    public String testPojo(Person person) {
        return userServiceBO.testPojo(person);
    }
}
