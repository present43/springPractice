package com.liuzheng.cglib;

import com.liuzheng.proxy.Producer;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

// 模拟一个消费者
public class Client {
    public static void main(String[] args) {
        // 匿名内部类访问外部成员变量时，需要用Final 修饰
        final Producer producer = new Producer();
        // producer
        /**
         * 动态代理：
         * 特点：字节码随用随创建，随用随加载
         * 作用：不修改源码的基础上对方法增强
         * 分类：
         *      基于接口的动态代理
         *      基于子类的动态代理 cglib
         * 基于子类的动态代理：
         *      涉及的类：Enhancer
         *      提供者： 第三方库cglib
         *  如何创建代理对象：
         *      使用Enhancer类中的create方法
         *  创建代理对象的要求:
         *      被代理的类不能是最终类
         *  create方法的参数：
         *      Class字节码 用于指定被代理对象的字节码。
         *      Callback: 用于提供增强的代码
         *
         */

    }
}
