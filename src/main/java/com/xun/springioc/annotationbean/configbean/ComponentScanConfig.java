package com.xun.springioc.annotationbean.configbean;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @Configuration:标识这个类是一个配置类
 * @ComponentScan:配置springIOC要扫描的包的路径,
 * 只要是标注了@Component,@Controller,@Service,@Repository的类都会被spingIOC管理
 * 如果没有配置扫描路径的话@ComponentScan会默认扫描与配置类相同的包及其子包
 * 如果更倾向于xml启用组件扫描的话,可以使用Spring context命名空间的<context:component-scan>元素
 */
@Configuration
@ComponentScan(value = "com.xun.springioc.annotationbean.*")
//@ComponentScan(basePackageClasses = CDServise.class)
public class ComponentScanConfig {

}
