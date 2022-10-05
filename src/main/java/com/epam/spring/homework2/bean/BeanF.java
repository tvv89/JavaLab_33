package com.epam.spring.homework2.bean;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Lazy
@Component
public class BeanF extends EntityBean {

    @Override
    public String toString() {
        return "BeanF{" +
                "name='" + name + '\'' +
                ", value='" + value + '\'' +
                '}';
    }
}
