package com.zwh.dubboconsumer.service;

import com.zwh.sdk.po.PersonImpl;
import lombok.extern.slf4j.Slf4j;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class ConsumerServiceTest {

    @Autowired
    private ConsumerService consumerService;

    @Test
    public void test1() {
        Assert.assertNotNull(consumerService);
        log.info(consumerService.sayHello("dubbo"));
        log.info(consumerService.sayHello2("dubbo"));
        PersonImpl person = new PersonImpl();
        person.setName("LittleCat");
        person.setAge(20);
        log.info(consumerService.testPojo(person));
    }
}
