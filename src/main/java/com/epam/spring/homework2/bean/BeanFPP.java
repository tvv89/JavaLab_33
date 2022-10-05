package com.epam.spring.homework2.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;

public class BeanFPP implements BeanFactoryPostProcessor {
    private final String name;
    private final String methodName;

    public BeanFPP(String name, String methodName) {
        this.name = name;
        this.methodName = methodName;
    }

    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory configurableListableBeanFactory) throws BeansException {
        BeanDefinition beanDefinition = configurableListableBeanFactory.getBeanDefinition(name);
        beanDefinition.setInitMethodName(methodName);
        System.out.println("BeanFactoryPostProcessor create new init method: secondInit");
    }
}
