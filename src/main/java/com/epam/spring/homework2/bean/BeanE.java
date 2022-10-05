package com.epam.spring.homework2.bean;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class BeanE extends EntityBean {

    @Override
    public String toString() {
        return "BeanE{" +
                "name='" + name + '\'' +
                ", value='" + value + '\'' +
                '}';
    }

    @PostConstruct
    public void init() {
        System.out.println("@PostConstruct method BeanE");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("@PreDestroy method BeanE");
    }
}
