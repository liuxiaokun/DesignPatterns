/**
 * @author Fred Liu <fredliu@augmentum.com.cn>
 * @version 1.6
 * @since Jan 25, 2015
 */
package com.fred.singleton.d;

public class Singleton {

    private static Singleton instance = null;

    private Singleton() {
        // private constructor.
    }

    /**
     * Used to implement lazy loading,
     * and thread is safe,
     * but it has low efficiency.
     *  99% do not need synchronize.
     */
    public static synchronized Singleton getInstance() {

        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}