/**
 * @author Fred Liu <fredliu@augmentum.com.cn>
 * @version 1.6
 * @since Jan 26, 2015
 */
package com.fred.factory.c;

public class SmsSender implements Sender {

    @Override
    public void send(String content) {
        System.out.println("Sms send :" + content);
    }
}
