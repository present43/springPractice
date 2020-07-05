package com.liuzheng.service.Impl;


import com.liuzheng.service.AccountService;

public class AccountServiceImpl implements AccountService {

    //这里 模拟服务层 处理业务逻辑
    public Object saveAccount(String account) {
        //调用 数据访问层
        System.out.println("业务处理层执行");
        return null;
    }
}
