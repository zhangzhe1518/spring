package com.xun.springioc.factorybean;

import org.springframework.beans.factory.FactoryBean;

/**
 * @author zhangzhe
 * 自定义fanctoryBean需要实现Spring提供的FactoryBean接口
 */
public class CarFactoryBean implements FactoryBean<Car> {

    /**
     * 品牌
     */
    private String brand;

    public void setBrand(String brand) {
        this.brand = brand;
    }

    /**
     * 返回bean的对象
     */
    public Car getObject() throws Exception {
        return new Car(brand,450000.99);
    }

    /**
     * 返回bean的类型
     */
    public Class<?> getObjectType() {
        return Car.class;
    }

    /**
     * 是否为单实例
     */
    public boolean isSingleton() {
        return true;
    }
}
