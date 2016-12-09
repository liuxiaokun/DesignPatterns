package com.fred.proxy.a;

/**
 * @author Fred Liu(liuxiaokun0410@gmail.com)
 * @version 1.7
 * @since 2016/12/9
 */
public class ProxyTest {


    public static void main(String[] args) {
        Sourceable source = new Proxy();
        source.method();
    }

}
