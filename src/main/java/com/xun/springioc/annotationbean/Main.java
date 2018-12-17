package com.xun.springioc.annotationbean;

import com.xun.springioc.annotationbean.controller.UserController;
import com.xun.springioc.annotationbean.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans-annotation.xml");
        UserController userController = (UserController) context.getBean("userController");
        System.out.println(userController);
        UserService userService = (UserService) context.getBean("userService");
        System.out.println(userService);

    }
}
