package com.liuzheng.controller;


import com.liuzheng.service.Impl.AccountServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.annotation.Resource;
import java.applet.AppletContext;

/**
 模拟 控制层
    ApplicationContext 接口常用的三个实现类
        ClassPathXmlApplicationContext：可以加载类路径下的配置文件   (这个更常用)
        FileSystemXmlApplicationContext：可以加载 任意路径下的配置文件 （需要访问权限 和 绝对路径）
        AnnotationConfigApplicationContext : 可以读取注解创建的容器
    核心容器二个 接口引发的问题
        ApplicationContext ：读取配置文件时，直接创建对象  （单例情况下 ，一般都是用这个）
        BeanFactory : 需要一个 Resource 对象 来读取配置文件， 属于懒加载，就是到需要用时才加载  （多例情况适应）
            二种情况根究 不同情况来使用
 */

public class Control {
    public static void main(String[] args) {
        // 这里是 直接创建。等下改为 配置文件
        // AccountServiceImpl accountService = new AccountServiceImpl();
        //  从spring 里取
        // 获取 bean 对象
        ClassPathXmlApplicationContext ac  = new ClassPathXmlApplicationContext("bean.xml");

        // 通过对象容器  获取需要的资源  传入键值（ID）
        AccountServiceImpl accountService = (AccountServiceImpl) ac.getBean("AccountServiceImpl");
        AccountServiceImpl accountService2 = ac.getBean("AccountServiceImpl",AccountServiceImpl.class);
        String account = "liu";
        accountService.saveAccount(account);

        // 关闭容器 调用销毁方法 销毁方法需要自定义 只是 提供了这种方法
        ac.close();

    }

}
