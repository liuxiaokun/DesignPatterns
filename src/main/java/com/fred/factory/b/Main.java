/**
 * @author Fred Liu <fredliu@augmentum.com.cn>
 * @version 1.6
 * @since Jan 26, 2015
 */
package com.fred.factory.b;

public class Main {

    public static void main(String[] args) {

        new SenderFactory().getMailSender().send("mail content");
        new SenderFactory().getSmsSender().send("sms content");
    }
}
