/**
 * @author Fred Liu <fredliu@augmentum.com.cn>
 * @version 1.6
 * @since Jan 25, 2015
 */
package com.fred.singleton.c;

public class Singleton {

    private static Singleton instance = null;

    private Singleton() {
        // private constructor.
    }

    /**
     * 
     * used to implement lazy loading.
     * But thread is not safe.
     * 
     */
    public static Singleton getInstance() {

        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}
