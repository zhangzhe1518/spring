package com.xun.springioc.beanslifecycle;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author zhangzhe
 * bean的生命周期
 * SpringIOC容器对bean的生命周期进行管理的过程:
 * - 通过构造器或工厂方法创建bean的实例
 * - 为bean的属性设置值和对其它bean的引用
 * - 调用bean的初始化方法
 * - bean可以使用了
 * - 当容器关闭时,调用bean的销毁方法
 * 在Bean的声明里设置init-method和destory-method属性,为bena指定初始化方法和销毁方法
 */
public class Main {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans-lifecycle.xml");
        Bus bus = (Bus) context.getBean("car");
        System.out.println(bus);
        //关闭ioc容器 调用bean的destroy方法
        context.close();
    }
}
