package com.xun.springioc.factorybean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("factorybean.xml");
        Car car = (Car) context.getBean("car");
        System.out.println(car);
    }
}
