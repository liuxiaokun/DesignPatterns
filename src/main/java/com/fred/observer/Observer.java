package com.fred.observer;

/**
 * Created by fred on 6/28/17.
 */
public interface Observer {

    /**
     * 关心的主题发生变化时，通过此方法通知自己．
     */
    void notifyMe(String message);
}
