package com.xun.springioc.annotationbean.configbean;

import com.xun.springioc.annotationbean.configbean.service.CDServise;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = ComponentScanConfig.class)
public class ComponentScanTest {

    /**
     * @Autowired注解不仅能够用在构造器上，还能用在属性的setter上
     * 假如有且只有一个bean匹配依赖需求的话那么这个bean将会被装配进来
     * 如果没有匹配的bean的话，那么在创建应用上下文的话Spring就会抛出异常
     * 如果有多个bean都能满足依赖关系的话，spring也会抛出异常，表明没有指定要选择哪个bean进行自动装配
     */
    @Autowired
    private CDServise cdServise;

    @org.junit.Test
    public void test(){
        cdServise.play();
    }
}
