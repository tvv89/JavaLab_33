package com.epam.spring.homework2.config;

import com.epam.spring.homework2.bean.*;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.*;
import org.springframework.core.annotation.Order;

@Configuration
@ComponentScan(basePackages = "com.epam.spring.homework2.bean")
@PropertySource(value = "application.properties")
@Import(SecondConfig.class)
public class BeansConfig {

    @Bean(initMethod = "init", destroyMethod = "destroy")
    @Order(1)
    public BeanD beanD(@Value("${bean.d.name}") String name, @Value("${bean.d.value}") String value) {
        return new BeanD(name, value);
    }

    @Bean(initMethod = "init", destroyMethod = "destroy")
    @Order(2)
    public BeanB beanB(@Value("${bean.b.name}") String name, @Value("${bean.b.value}") String value) {
        return new BeanB(name, value);
    }

    @Bean(initMethod = "init", destroyMethod = "destroy")
    @Order(3)
    public BeanC beanC(@Value("${bean.c.name}") String name, @Value("${bean.c.value}") String value) {
        return new BeanC(name, value);
    }

    @Bean
    public static BeanFPP beanFPP() {
        return new BeanFPP("beanB", "secondInit");
    }

    @Bean
    public BeanPP beanPP() {
        return new BeanPP();
    }


}
