/**
 * @author Fred Liu <fredliu@augmentum.com.cn>
 * @version 1.6
 * @since Jan 25, 2015
 */
package com.fred.singleton.f;

/**
 * It was recommended By Josh Bloch.(Effective Java)
 *
 */
public enum Singleton {

    INSTANCE;

    private Singleton() {
    }

}