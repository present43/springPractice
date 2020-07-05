package com.liuzheng.service.Impl;


import com.liuzheng.dao.AccountDAO;
import com.liuzheng.service.AccountService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AccountServiceImpl implements AccountService {


    //调用数据访问层 处理数据
     AccountDAO accountDAO  = new AccountDAO();
    // 通过是 spring 来获取
    // 先获得 spring 的核心容器



    //这里 模拟服务层 处理业务逻辑
    public Object saveAccount(String account) {
        //调用 数据访问层
        accountDAO.account();
        System.out.println("业务处理层执行");
        return null;
    }
}
