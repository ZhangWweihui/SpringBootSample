package com.zwh.sdk.po;

/**
 * @author zhangweihui
 */
public class PersonImpl implements Person {

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
