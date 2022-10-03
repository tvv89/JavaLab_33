package com.epam.spring.homework2;

import com.epam.spring.homework2.bean.BeanA;
import com.epam.spring.homework2.bean.BeanB;
import com.epam.spring.homework2.bean.BeanC;
import com.epam.spring.homework2.bean.BeanD;
import com.epam.spring.homework2.config.BeansConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Homework2Application {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(BeansConfig.class);
        System.out.println(context.getBean(BeanA.class).toString());
        System.out.println(context.getBean(BeanB.class).toString());
        System.out.println(context.getBean(BeanC.class).toString());
        System.out.println(context.getBean(BeanD.class).toString());
    }

}
