package com.zwh.sdk.bo;

import com.zwh.sdk.po.Person;

/**
 * @author zhangweihui
 */
public interface UserServiceBO {

    String sayHello(String name);

    String sayHello2(String name);

    String testPojo(Person person);

}
