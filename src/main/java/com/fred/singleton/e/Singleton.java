/**
 * @author Fred Liu <fredliu@augmentum.com.cn>
 * @version 1.6
 * @since Jan 25, 2015
 */
package com.fred.singleton.e;

public class Singleton {

    private static class SingletonHolder {
        private static final Singleton INSTANCE = new Singleton();
    }

    private Singleton() {
    }

    /**
     * when the classloder loaded Single, INSTANCE has not initialize.
     * when the SingletonHolder was loaded, the was initialized.
     * implement the lazy loading.
     * 
     */
    public static final Singleton getInstance() {
        return SingletonHolder.INSTANCE;
    }
}