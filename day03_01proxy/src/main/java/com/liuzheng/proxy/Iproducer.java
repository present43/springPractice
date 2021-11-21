package com.liuzheng.proxy;

//对生产厂家的要求的接口
public interface Iproducer {
    //销售方法
    public void saleProducer(float money);

    //售后方法
    public void afterService(float money);
}
