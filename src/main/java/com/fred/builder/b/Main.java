package com.fred.builder.b;

/**
 * @author Fred Liu(liuxiaokun0410@gmail.com)
 * @version 1.7
 * @since 2016/12/9
 */
public class Main {

    /**
     * 建造者模式将很多功能集成到一个类里，这个类可以创造出比较复杂的东西。
     * 所以与工程模式的区别就是：工厂模式关注的是创建单个产品，而建造者模式则关注创建符合对象，多个部分。
     *
     * @param args args
     */
    public static void main(String[] args) {

        Builder builder = new Builder();
        builder.produceMailSender(10);
        builder.produceSmsSender(8);
    }
}
