package com.epam.spring.homework2.config;

import com.epam.spring.homework2.bean.BeanB;
import com.epam.spring.homework2.bean.BeanC;
import com.epam.spring.homework2.bean.BeanD;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.*;
import org.springframework.core.annotation.Order;

@Configuration
@ComponentScan(basePackages = "com.epam.spring.homework2.bean")
@PropertySource(value = "application.properties")
@Import(SecondConfig.class)
public class BeansConfig {

    @Order(2)
    @Bean(initMethod = "init", destroyMethod = "destroy")
    public BeanB beanB(@Value("${bean.b.name}") String name, @Value("${bean.b.value}") String value) {
        return new BeanB(name, value);
    }

    @Order(3)
    @Bean(initMethod = "init", destroyMethod = "destroy")
    public BeanC beanC(@Value("${bean.c.name}") String name, @Value("${bean.c.value}") String value) {
        return new BeanC(name, value);
    }

    @Order(1)
    @Bean(initMethod = "init", destroyMethod = "destroy")
    public BeanD beanD(@Value("${bean.d.name}") String name, @Value("${bean.d.value}") String value) {
        return new BeanD(name, value);
    }



}
