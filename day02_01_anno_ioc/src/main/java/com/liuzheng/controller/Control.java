package com.liuzheng.controller;

import com.liuzheng.service.Impl.AccountServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;

import javax.annotation.Resource;

/**
 spring 注解分类:
 用来创建对象并分层的:   注意需要配置扫描
    Component:
        可以标注在类上,用来创建对象, 有一个 value 属性用来指定存入的对象的ID 值
        如果没有写则默认为对象名称,首字母小写 .此注解一般作用在不属于三层的任何一层上 .
    Controller:
        功能同上,但是一般是标注在控制层
    Service :
        功能同上,一般作用在服务层
    Repository:
        功能同上,一般作用在持久层
 用来注入对象的:
    Autowired :
        用来自动注入对象的, 按照类型注入. 只要容器里有唯一的一个bean对象类型和要注入的变量类型匹配,就可以注入成功
        当有多个同类型的数据时,可和 Qualifier 注解配合使用.
    Qualifier :
        按照类中注入的基础上,再按照名称注入. 需要配合 Autowired 进行使用
     Resource :
        直接按照 Bean 的 ID 名称进行注入 ,属性为 name.
 用来设置作用范围的 :
 生命周期相关的 :  了解即可

 */
@Controller
public class Control {

    public static void main(String[] args) {

        ApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
        AccountServiceImpl impl = ac.getBean("accountServiceImpl", AccountServiceImpl.class);
        impl.saveAccount();
        impl.saveAccount2();
    }

}