package com.liuzheng.dao;

/**
 数据访问层

 */

public class AccountDAO {
    // 获取连接 之后改为配置文件
    JDBC jdbc = new JDBC();

    public Object  account() {
        System.out.println("数据访问层执行");
        return null;
    }

}
