/**
 * @author Fred Liu <fredliu@augmentum.com.cn>
 * @version 1.6
 * @since Jan 25, 2015
 */
package com.fred.singleton.a;

public class Singleton {

    private static Singleton instance = new Singleton();

    private Singleton() {
        // private constructor.
    }

    /**
     * 
     * Thread safe, but there is not the lazy loading.
     *
     */
    public static Singleton getInstance() {

        return instance;
    }
}