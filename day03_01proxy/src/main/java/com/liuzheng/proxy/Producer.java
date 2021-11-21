package com.liuzheng.proxy;

/**
 * 一个生产者
 */
public class Producer implements Iproducer {
    //销售方法
    public void saleProducer(float money){
        System.out.println("销售产品，并拿到钱：" + money);
    }

    //售后方法
    public void afterService(float money) {
        System.out.println("提供售后服务，并拿到钱：" + money);
    }
}
