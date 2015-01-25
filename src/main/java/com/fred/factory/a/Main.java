/**
 * @author Fred Liu <fredliu@augmentum.com.cn>
 * @version 1.6
 * @since Jan 26, 2015
 */
package com.fred.factory.a;

public class Main {

    public static void main(String[] args) {

        new SenderFactory().getSender("Sms").send(" Sms content");
        new SenderFactory().getSender("Mail").send(" Mail content");
        new SenderFactory().getSender("SmSsss").send(" sms content");
    }
}
