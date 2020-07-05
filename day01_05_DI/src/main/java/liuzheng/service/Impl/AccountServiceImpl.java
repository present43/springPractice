package liuzheng.service.Impl;


import liuzheng.service.AccountService;

import java.util.Date;

public class AccountServiceImpl implements AccountService {

    //定义几个成员变量,用来注入  关注数据类型
    private String name;
    private Integer age;
    private Date birthday;

    // 定义构造器     定义了一个 就没有默认的了
    public AccountServiceImpl(String name, Integer age, Date birthday) {
        this.name = name;
        this.age = age;
        this.birthday = birthday;
    }

    //第二种方法  使用set 来进行数据的注入
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    //这里 模拟服务层 处理业务逻辑
    public Object saveAccount() {
        //调用 数据访问层
        System.out.println("业务处理层执行");
        System.out.println("打印注入的数据"+"name ="+name +"  age" +age + "  生日" + birthday);
        return null;
    }
}
