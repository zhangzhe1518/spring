package com.xun.springioc.annotationbean.controller;

import org.springframework.stereotype.Controller;

@Controller
public class UserController {

    public void execute(){
        System.out.println("UserController.execute()...");
    }
}
