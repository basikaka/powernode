package com.hogrider.vo;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties( prefix = "user")
public class User {

    private String name;

    private Integer num;

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", num=" + num +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }
}
