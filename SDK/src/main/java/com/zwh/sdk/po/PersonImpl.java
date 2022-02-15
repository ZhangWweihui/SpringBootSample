package com.zwh.sdk.po;

import java.io.Serializable;

/**
 * @author zhangweihui
 */
public class PersonImpl implements Person, Serializable {

    private String name;
    private Integer age;

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public Integer getAge() {
        return age;
    }
}
