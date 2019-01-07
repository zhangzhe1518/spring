package com.xun.aop;

import org.springframework.stereotype.Component;

@Component
public class HelloWorld {


    public void sayhello(String str){
        System.out.println("HELLO WORLD " + str);
    }
}
