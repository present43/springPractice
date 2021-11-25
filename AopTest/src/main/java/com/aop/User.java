package com.aop;

import org.springframework.stereotype.Component;

@Component
public class User {

    public void add(){
        System.out.println("切入点");
    }
}
