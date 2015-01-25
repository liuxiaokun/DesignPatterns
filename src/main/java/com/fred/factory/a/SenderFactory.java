/**
 * @author Fred Liu <fredliu@augmentum.com.cn>
 * @version 1.6
 * @since Jan 26, 2015
 */
package com.fred.factory.a;

public class SenderFactory {

    public Sender getSender(String type) {
        Sender sender = null;

        if ("Sms".equals(type)) {
            sender = new SmsSender();
        } else if ("Mail".equals(type)) {
            sender = new MailSender();
        } else {
            System.out.println("Incorrect Type !");
        }
        return sender;
    }
}
