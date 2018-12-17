package com.xun.springioc.autowired;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author zhangzhe
 * bean的自动装配
 */
public class Main {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans-autowrite.xml");
        Teacher teacher = (Teacher) context.getBean("teacher");
        System.out.println(teacher);
        System.out.println("=============================");
        Teacher teacher1 = (Teacher) context.getBean("teacher1");
        System.out.println(teacher1);
        System.out.println("=============================");
        Teacher teacher2 = (Teacher) context.getBean("teacher2");
        System.out.println(teacher2);
    }
}
