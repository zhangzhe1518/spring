package com.xun.springioc.beanrelation;

import com.xun.springioc.autowired.Address;
import com.xun.springioc.autowired.Teacher;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author zhangzhe
 * bean之间的继承和依赖关系
 */
public class Main {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans-relation.xml");
        // 抽象bean不能被实例化 Error creating bean with name 'address': Bean definition is abstract
        //Address address = (Address) context.getBean("address");
        //System.out.println(address);
        System.out.println("===================");
        Address address1 = (Address) context.getBean("address1");
        System.out.println(address1);
        System.out.println("===================");
        Teacher teacher = (Teacher) context.getBean("teacher");
        System.out.println(teacher);
    }
}
