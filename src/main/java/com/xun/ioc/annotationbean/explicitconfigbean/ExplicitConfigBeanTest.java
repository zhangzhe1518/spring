package com.xun.ioc.annotationbean.explicitconfigbean;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = BeansConfig.class)
public class ExplicitConfigBeanTest {

    @Autowired
    private User user;
    @Test
    public void tets(){
        System.out.println(user.setName("显示声明javaBean"));
    }

}
