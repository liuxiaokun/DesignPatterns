/**
 * @author Fred Liu <fredliu@augmentum.com.cn>
 * @version 1.6
 * @since Jan 25, 2015
 */
package com.fred.singleton.g;

public class Singleton {

    private static Singleton singleton = null;

    private Singleton() {
        // private constructor.
    }

    public static Singleton getInstance() {

        if (null == singleton) {

            synchronized (Singleton.class) {

                if (null == singleton) {
                    singleton = new Singleton();
                }
            }
        }

        return singleton;
    }
}
