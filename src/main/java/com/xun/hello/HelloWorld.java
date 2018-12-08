package com.xun.hello;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author zhangzhe
 */
public class HelloWorld {

    private String sayHello;

    public HelloWorld() {
    }

    public HelloWorld(String sayHello) {
        this.sayHello = sayHello;
    }

    /**
     * sayHello
     * @return
     */
    public String getSayHello() {
        return sayHello;
    }

    public void setSayHello(String sayHello) {
        this.sayHello = sayHello;
    }

    public void hello(){
        System.out.println("sayHello:"+sayHello);
    }

    public static void main(String[] args) {
        //创建Spring的ioc容器对象
        //ApplicationContext代表IOC容器
        /**
         * 在SpringIOC容器读取Bean的配置创建Bean实例之前，必须对容器进行实例化
         * 只有容器在实例化之后，才可以从IOC容器中获取Bean实例并使用
         * Spring提供了两种类型的IOC容器实现：
         * BeanFactory：IOC容器的基本实现
         * ApplicationContext：提供了更多的高级特性，是BeanFactory的子接口
         * BeanFactory是Spring框架的基础设施，面向Spring本身；
         * ApplicationContext面向使用Spring框架的开发者，几乎所有的应用场合都直接使用ApplicationContext,而非BeanFactory.
         */
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        //从IOC容器中获取Bean的实例对象
        HelloWorld hello = (HelloWorld)context.getBean("hello");
        //调用hello方法
        hello.hello();
    }
}
