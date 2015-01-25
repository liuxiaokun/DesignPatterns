/**
 * @author Fred Liu <fredliu@augmentum.com.cn>
 * @version 1.6
 * @since Jan 26, 2015
 */
package com.fred.factory.c;

public class Main {

    public static void main(String[] args) {

        new MailFactory().getSender().send(" mail content");
        new SmsFactory().getSender().send(" sms content ");
    }
}
