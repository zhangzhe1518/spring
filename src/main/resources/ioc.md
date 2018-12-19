### Spring配置的可选方案
spring容器负责创建应用程序中的bean并通过DI来协调这些对象之间的关系。但是作为开发人员，需要告诉spring要创建哪些bean并且如何将其装配在一起：</br>spring提供了三种主要的装配机制
- 在xml中进行显式配置
- 在java代码中进行显式配置(javaConfig)
- 隐式的bean发现机制和自动装配机制
#### 自动化装配bean
spring从两个角度来实现自动化装配
- 组件扫描(component scanning):Spring会自动发现应用上下文中所创建的bean
- 自动装配(autowiring):spring自动满足bean之间的依赖
