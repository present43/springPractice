package liuzheng.controller;


import liuzheng.service.Impl.AccountServiceImpl;
import liuzheng.service.Impl.AccountServiceImpl2;
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
        AccountServiceImpl impl = ac.getBean("AccountServiceImpl", AccountServiceImpl.class);
        impl.saveAccount();

        AccountServiceImpl2 impl2 = ac.getBean("AccountServiceImpl2", AccountServiceImpl2.class);
        impl2.saveAccount();

        // 默认是单例的 ,即 为true

        String account = "liu";


    }

}
