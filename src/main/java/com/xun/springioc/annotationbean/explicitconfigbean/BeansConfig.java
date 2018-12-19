package com.xun.springioc.annotationbean.explicitconfigbean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author 寻。
 * 显式声明javaBean
 */
@Configuration
public class BeansConfig {

    @Bean
    public User user(){
        return new User("xun","23");
    }
}
