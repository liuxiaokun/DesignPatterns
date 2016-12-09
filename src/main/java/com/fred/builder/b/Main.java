package com.fred.builder.b;

/**
 * @author Fred Liu(liuxiaokun0410@gmail.com)
 * @version 1.7
 * @since 2016/12/9
 */
public class Main {

    public static void main(String[] args) {

        Builder builder = new Builder();
        builder.produceMailSender(10);
        builder.produceSmsSender(8);
    }
}
