package com.xun.scope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author zhangzhe
 * spring_bean的作用域
 */
public class Main {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans-scope.xml");
        Student student = (Student) context.getBean("student");
        Student student1 = (Student) context.getBean("student");
        //true scope=singleton单例bean 无参构造方法在getBean()之前执行一次
        System.out.println(student==student1);
        System.out.println("============================");
        Student stu = (Student) context.getBean("stu");
        Student stu1 = (Student) context.getBean("stu");
        //false scope=prototype原型的 无参构造方法在每次getBean()的时候都会执行一次
        System.out.println(stu==stu1);
    }
}
