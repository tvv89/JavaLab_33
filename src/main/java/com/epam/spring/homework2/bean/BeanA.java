package com.epam.spring.homework2.bean;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

@Component
public class BeanA extends EntityBean implements InitializingBean, DisposableBean {

    @Override
    public String toString() {
        return "BeanA{" +
                "name='" + name + '\'' +
                ", value='" + value + '\'' +
                '}';
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Run method afterPropertiesSet in BeanA");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("Run method destroy in BeanA");
    }
}
