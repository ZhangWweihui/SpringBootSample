package com.zwh.dubboconsumer.service;

import com.zwh.sdk.bo.EchoServiceBO;
import com.zwh.sdk.bo.NetworkServiceBO;
import com.zwh.sdk.bo.UserServiceBO;
import com.zwh.sdk.po.PersonImpl;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.stereotype.Component;

/**
 * @Description
 * @Author 张炜辉
 * @Date 2019/6/16
 */
@Component
public class ConsumerService {

    @DubboReference(group = "dubbo", interfaceClass = UserServiceBO.class, version = "1.0.0", timeout = 10000)
    private UserServiceBO userServiceBO;
    @DubboReference(group = "dubbo", interfaceClass = NetworkServiceBO.class, version = "1.0.0", timeout = 10000)
    private NetworkServiceBO networkServiceBO;
    @DubboReference(group = "dubbo", interfaceClass = EchoServiceBO.class, version = "1.0.0", timeout = 10000)
    private EchoServiceBO echoServiceBO;

    public String sayHello(String name) {
        return userServiceBO.sayHello(name);
    }

    public String sayHello2(String name) {
        return userServiceBO.sayHello2(name);
    }

    public String testPojo(PersonImpl person) {
        return userServiceBO.testPojo(person);
    }

    public String connect() {
        return networkServiceBO.connect();
    }

    public String disconnect() {
        return networkServiceBO.disconnect();
    }

    public String reconnect() {
        return networkServiceBO.reconnect();
    }

    public String echo(String message) {
        return echoServiceBO.echo(message);
    }
}
