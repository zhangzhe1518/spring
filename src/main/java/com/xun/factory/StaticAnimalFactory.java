package com.xun.factory;

import java.util.HashMap;
import java.util.Map;

/**
 * @author zhangzhe
 * 静态工厂方法
 * 直接调用某一个类的静态方法,就可以返回Bean的实例
 */
public class StaticAnimalFactory {

    private static Map<String,Animal> animalMap = new HashMap<String, Animal>();

    static{
        animalMap.put("dog", new Animal("dog","5"));
        animalMap.put("cat", new Animal("cat","3"));
    }

    public static Animal getAnimal(String name){
        return animalMap.get(name);
    }
}
