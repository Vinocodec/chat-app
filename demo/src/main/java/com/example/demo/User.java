package com.example.demo;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@ConfigurationProperties(prefix = "user")

public class User {
    private String name;
    private List<User> list;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
