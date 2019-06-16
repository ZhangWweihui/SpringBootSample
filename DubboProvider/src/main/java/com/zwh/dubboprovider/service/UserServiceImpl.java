package com.zwh.dubboprovider.service;

import com.alibaba.fastjson.JSON;
import com.zwh.sdk.Person;
import com.zwh.sdk.UserServiceBO;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.stereotype.Component;

/**
 * @Description
 * @Author 张炜辉
 * @Date 2019/6/16
 */
@Component
@Service(interfaceClass = UserServiceBO.class,group="dubbo",version="1.0.0", timeout = 10000)
public class UserServiceImpl implements UserServiceBO {

    @Override
    public String sayHello(String name) {
        //让当前当前线程休眠2s
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        return "sayHello:"+name;
    }

    @Override
    public String sayHello2(String name) {
        //让当前当前线程休眠2s
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        return "sayHello2:"+name;
    }

    @Override
    public String testPojo(Person person) {
        return JSON.toJSONString(person);
    }
}
