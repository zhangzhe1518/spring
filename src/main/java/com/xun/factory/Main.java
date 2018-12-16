package com.xun.factory;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans-factory.xml");
        Animal animal = (Animal) context.getBean("animal");
        System.out.println(animal);
    }
}
