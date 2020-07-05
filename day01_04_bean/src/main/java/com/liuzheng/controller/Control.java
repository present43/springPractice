package com.liuzheng.controller;


import com.liuzheng.service.Impl.AccountServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 模拟 控制层

 */

public class Control {
    public static void main(String[] args) {
        // 这里是 直接创建。等下改为 配置文件
        // AccountServiceImpl accountService = new AccountServiceImpl();
        //  从spring 里取
        // 获取 bean 对象 父类引用指向子类对象 多态
        ApplicationContext ac  = new ClassPathXmlApplicationContext("bean.xml");

        // 通过对象容器  获取需要的资源  传入键值（ID）
        AccountServiceImpl accountService = (AccountServiceImpl) ac.getBean("AccountServiceImpl");
        AccountServiceImpl accountService2 = ac.getBean("AccountServiceImpl",AccountServiceImpl.class);
        // 默认是单例的 ,即 为true
        System.out.println(accountService == accountService2);
        String account = "liu";
        accountService.saveAccount(account);

    }

}
