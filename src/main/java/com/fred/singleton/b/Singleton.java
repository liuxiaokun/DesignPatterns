/**
 * @author Fred Liu <fredliu@augmentum.com.cn>
 * @version 1.6
 * @since Jan 25, 2015
 */
package com.fred.singleton.b;

public class Singleton {

    private static Singleton instance = null;

    static {
        instance = new Singleton();
    }

    private Singleton() {
    }

    /**
     * the same as demo a.
     * @return
     */
    public static Singleton getInstance() {
        return instance;
    }
}