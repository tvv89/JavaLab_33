package com.epam.spring.homework2.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

@Component
public class BeanPP implements BeanPostProcessor {
    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        if (EntityBean.class.isAssignableFrom(bean.getClass())) {
           EntityBean validation = (EntityBean) bean;
            if (validation.getName() == null) {
                System.out.println("Bad name for "+ validation.getClass().getSimpleName());
                throw new IllegalArgumentException("Bad name for bean " + validation.getClass().getSimpleName());
            }
            if (validation.getValue() == null || validation.getValue().equals("")) {
                System.out.println("Bad value for "+ validation.getClass().getSimpleName());
                throw new IllegalArgumentException("Bad value for bean " + validation.getClass().getSimpleName());
            }
            System.out.println("Correct bean data for " + validation.getClass().getSimpleName());
            return bean;
        }
        return bean;
    }

}
