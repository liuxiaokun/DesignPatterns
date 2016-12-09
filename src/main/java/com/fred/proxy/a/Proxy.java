package com.fred.proxy.a;

/**
 * @author Fred Liu(liuxiaokun0410@gmail.com)
 * @version 1.7
 * @since 2016/12/9
 */
public class Proxy implements Sourceable {

    private Source source;


    public Proxy() {
        this.source = new Source();
    }

    @Override
    public void method() {

        before();
        source.method();
        after();
    }

    private void after() {
        System.out.println("after proxy!");
    }

    private void before() {
        System.out.println("before proxy!");
    }
}
