package liuzheng.service.Impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AccountServiceImpl2 {

    //定义几个成员变量,用来注入  关注数据类型
    private String name;
    private Integer age;
    private Date birthday;
    private ArrayList arr[];

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public void setArr(ArrayList[] arr) {
        this.arr = arr;
    }

    //这里 模拟服务层 处理业务逻辑
    public Object saveAccount() {
        //调用 数据访问层
        System.out.println("业务处理层执行");
        System.out.println("打印注入的数据"+"name ="+name +"  age" +age + "  生日" + birthday);
        System.out.println(arr);
        return null;
    }
}
