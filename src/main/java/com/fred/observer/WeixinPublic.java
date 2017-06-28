package com.fred.observer;

/**
 *
 */
public class WeixinPublic implements Observer {

    private String userName;

    public WeixinPublic(String userName) {
        this.userName = userName;
    }

    @Override
    public void notifyMe(String message) {

        System.out.println("tell " + userName + " " + message);
    }
}
