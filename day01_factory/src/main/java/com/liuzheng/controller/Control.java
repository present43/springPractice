package com.liuzheng.controller;

import com.liuzheng.factory.BeanFactory;
import com.liuzheng.serviceImpl.AccountServiceImpl;

/**
 模拟 控制层
 */

public class Control {
    public static void main(String[] args) {
        // 这里是 直接创建。等下改为 配置文件
        // AccountServiceImpl accountService = new AccountServiceImpl();
        AccountServiceImpl accountService = (AccountServiceImpl) BeanFactory.getBean("AccountServiceImpl");
        String account = "liu";
        accountService.saveAccount(account);

    }

}
