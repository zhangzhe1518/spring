package com.xun.factory;

import java.util.HashMap;
import java.util.Map;

/**
 * @author zhangzhe
 * 实例工厂方法
 * 实例工厂的方法,即需要先创建工厂本身,再调用工厂的实例方法来返回bean的实例
 */
public class InstanceAnimalFactory {

    private static Map<String,Animal> animalMap = null;

    public InstanceAnimalFactory() {
        animalMap = new HashMap<String, Animal>();
        animalMap.put("dog", new Animal("dog","5"));
        animalMap.put("cat", new Animal("cat","5"));
    }

    public Animal getAnimal(String name){
        return animalMap.get(name);
    }
}
