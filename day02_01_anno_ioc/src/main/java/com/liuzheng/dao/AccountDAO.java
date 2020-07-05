package com.liuzheng.dao;

import org.springframework.stereotype.Repository;

/**
 数据访问层

 */

@Repository
public class AccountDAO {

    public Object  account() {
        System.out.println("数据访问层执行");
        return null;
    }

}
