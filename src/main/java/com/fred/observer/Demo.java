package com.fred.observer;

/**
 * Created by fred on 6/28/17.
 */
public class Demo {

    public static void main(String[] args) {

        Subject subject = new RealSubject();

        subject.attach(new WeixinPublic("Fred"));
        subject.attach(new WeixinPublic("Yang"));
        subject.attach(new WeixinPublic("Liu"));

        subject.notifyObservers("订阅号更新内容了");


    }
}
