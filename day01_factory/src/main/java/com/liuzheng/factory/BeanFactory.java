package com.liuzheng.factory;

import java.io.InputStream;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

/**
 Bean : 在计算机英语中的意思是可重用组件。
 此类为 Bean 工厂类，用来生成 Bean 对象，主要作用是解耦，提高程序的可重用性
 实际开发中，这些都是交给Spring 来做的
 */

public class BeanFactory {
    //用static 修饰 ， 静态才可以直接访问静态，并且 类共享一份
    private static Properties props;

    // 定义一个Map容器，用来存储反射创建出来的对象
    private static   Map<String,Object>  beans;

    // 静态代码块，只执行一次 一般用来初始化
    static {
        try {
            // 实例 配置文件类对象
            props = new Properties();
            // 获得 对应的字节 输入流
            InputStream in = BeanFactory.class.getClassLoader().getResourceAsStream("bean");
            //加载
            props.load(in);
            // 实例容器对象
            beans = new HashMap<String, Object>();

            // 获取对应的键值对  获得所有的键值，返回枚举类型
            Enumeration keys = props.keys();

            // 遍历键值， 获取对象 并存入容器
            while (keys.hasMoreElements()){
                String key = keys.nextElement().toString();
                // 获取全类名  不能直接把全限定类名当成key 来存 到时候取不出来，空指针异常
                String Path = props.getProperty(key);
                // 反射创建对象
                Object value = Class.forName(Path).newInstance();
                System.out.println(value);
                System.out.println(key);
                // 将 键值对添加进入容器
                beans.put(key ,value);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * 改造过后的 获取对象的方法  现在为单例
     *
     */
    public static Object getBean(String beanName){
        System.out.println(beans.get(beanName));
        return  beans.get(beanName);
    }



    /**
     获得对应的 配置文件全路径  来创建对象
    public Object getBean(String beanName){
        Object bean = null;
        //获得全限定类名
        String Path = props.getProperty(beanName);
        try {
            bean = Class.forName(Path).newInstance();

        } catch (Exception e) {
            e.printStackTrace();
        }
        return bean;
    }
     **/

}
