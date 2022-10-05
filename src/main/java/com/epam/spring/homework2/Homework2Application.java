package com.epam.spring.homework2;

import com.epam.spring.homework2.config.BeansConfig;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

public class Homework2Application {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = new AnnotationConfigApplicationContext(BeansConfig.class);
        System.out.println("=====Start output bean name=====");
        Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
        System.out.println("=====Finish output bean name=====");
        System.out.println("=====Start output bean definition=====");
        Arrays.stream(context.getBeanFactory().getBeanDefinitionNames())
                .forEach(bean ->
                        System.out.println(context.getBeanFactory().getBeanDefinition(bean)));
        System.out.println("=====Finish output bean definition=====");
        context.close();
    }

}
