package com.xun.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;
import java.util.Map;

/**
 * @author zhangzhe
 * 如何配置list和map
 */
public class Person {

    private String name;

    private String age;

    private Car car;

    private List<Car> cars;

    private Map<String,Car> carMap;

    public Map<String, Car> getCarMap() {
        return carMap;
    }

    public void setCarMap(Map<String, Car> carMap) {
        this.carMap = carMap;
    }

    public List<Car> getCars() {
        return cars;
    }

    public void setCars(List<Car> cars) {
        this.cars = cars;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", car=" + car + '\n' +
                ", cars=" + cars + '\n' +
                ", carMap=" + carMap +
                '}';
    }

    public static void main(String[] args) {
        ApplicationContext contex = new ClassPathXmlApplicationContext("beans.xml");
        Person person = (Person) contex.getBean("person");
        System.out.println(person);
        System.out.println("==============================");
        Person person1 = (Person) contex.getBean("person1");
        System.out.println(person1);
        System.out.println("==============================");
        Person person2 = (Person) contex.getBean("person2");
        System.out.println(person2);
    }
}
