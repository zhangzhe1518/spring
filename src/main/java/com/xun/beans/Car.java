package com.xun.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author zhangzhe
 * 使用构造器注入bean
 */
public class Car {

    private String brand;
    private String corp;
    private double price;
    private int maxSpeed;

    public Car(String brand, String corp, double price) {
        this.brand = brand;
        this.corp = corp;
        this.price = price;
    }

    public Car(String brand, String corp, int maxSpeed) {
        this.brand = brand;
        this.corp = corp;
        this.maxSpeed = maxSpeed;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", corp='" + corp + '\'' +
                ", price=" + price +
                ", maxSpeed=" + maxSpeed +
                '}';
    }

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Car car1 = (Car) context.getBean("car1");
        System.out.println(car1);

        Car car2 = (Car) context.getBean("car2");
        System.out.println(car2);


    }
}
