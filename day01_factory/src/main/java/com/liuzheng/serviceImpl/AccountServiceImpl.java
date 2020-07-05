package com.liuzheng.serviceImpl;

import com.liuzheng.dao.AccountDAO;
import com.liuzheng.factory.BeanFactory;
import com.liuzheng.service.AccountService;

public class AccountServiceImpl implements AccountService {


    //调用数据访问层 处理数据
    // AccountDAO accountDAO  = new AccountDAO();
    private  AccountDAO accountDAO = (AccountDAO) BeanFactory.getBean("AccountDAO");

    //这里 模拟服务层 处理业务逻辑
    public Object saveAccount(String account) {
        //调用 数据访问层
        accountDAO.account();
        System.out.println("业务处理层执行");
        return null;
    }
}
