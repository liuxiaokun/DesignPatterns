package com.fred.observer;

/**
 * Created by fred on 6/28/17.
 */
public interface Subject {

    /**
     * 注册当前主题
     */
    void attach(Observer observer);

    /**
     * 解除对主题
     */
    void detach(Observer observer);

    /**
     * 通知所有的观察者
     */
    void notifyObservers(String message);

}
