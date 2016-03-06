package net.classnotfound.aop.service;

import net.classnotfound.aop.annotation.Advisable;


public class MyServiceImpl implements MyService {

    @Advisable
    public void doSomething() {
        System.out.println("Does something very important!");
    }

    public void doSomethingElse() {
        System.out.println("Does something else more important!");

    }

}
