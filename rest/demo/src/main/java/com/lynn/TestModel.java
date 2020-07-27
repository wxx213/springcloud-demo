 package com.lynn;

import org.hibernate.validator.constraints.NotEmpty;

public class TestModel {

    @NotEmpty
    private String name;

    @NotEmpty
    private String age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }
}

