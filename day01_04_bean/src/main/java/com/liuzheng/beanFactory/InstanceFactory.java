package com.liuzheng.beanFactory;

import com.liuzheng.service.Impl.AccountServiceImpl;

/**
  模拟 jar 包文件  一个工厂类
  需要通过此类的 方法来获取 正真需要的对象资源

 */
public class InstanceFactory {

    // 模拟  此方法 可以 获得资源对象，如何通过Bean 对象来获取？？
    public AccountServiceImpl getAccountServiceImpl(){
        return  new AccountServiceImpl();
    }
}
