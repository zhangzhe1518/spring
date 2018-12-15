package com.xun.beanslifecycle;

public class Bus {

    private String brand;

    public Bus() {
        System.out.println("Bus's Constructor...");
    }

    public void setBrand(String brand) {
        System.out.println("setBrand...");
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "Bus{" +
                "brand='" + brand + '\'' +
                '}';
    }

    /**
     * bean的初始化方法
     */
    public void init(){
        System.out.println("init...");
    }

    /**
     * bean的销毁方法
     */
    public void destroy(){
        System.out.println("destroy...");
    }
}
