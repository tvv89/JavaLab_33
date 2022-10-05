package com.epam.spring.homework2.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BeanD extends EntityBean implements BeanLifeMethods{
    @Autowired
    public BeanD(String name, String value) {
        this.name = name;
        this.value = value;
    }


    @Override
    public String toString() {
        return "BeanD{" +
                "name='" + name + '\'' +
                ", value='" + value + '\'' +
                '}';
    }

    @Override
    public void init() {
        System.out.println("init: " + this);
    }

    @Override
    public void destroy() {
        System.out.println("destroy BeanD");
    }
}
