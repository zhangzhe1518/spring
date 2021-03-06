package com.xun.springioc.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Properties;

/**
 * @author zhangzhe
 * 配置Properties属性值
 */
public class DataSources {

    private Properties properties;

    public Properties getProperties() {
        return properties;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }

    @Override
    public String toString() {
        return "DataSources{" +
                "properties=" + properties +
                '}';
    }

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        DataSources dataSources = context.getBean(DataSources.class);
        System.out.println(dataSources);
    }
}
