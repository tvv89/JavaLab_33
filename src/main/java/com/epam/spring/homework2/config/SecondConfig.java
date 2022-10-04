package com.epam.spring.homework2.config;

import com.epam.spring.homework2.bean.BeanB;
import com.epam.spring.homework2.bean.BeanC;
import com.epam.spring.homework2.bean.BeanD;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages = "com.epam.spring.homework2.bean")
public class SecondConfig {


}
