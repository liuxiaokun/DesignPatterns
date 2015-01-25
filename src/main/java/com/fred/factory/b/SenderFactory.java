/**
 * @author Fred Liu <fredliu@augmentum.com.cn>
 * @version 1.6
 * @since Jan 26, 2015
 */
package com.fred.factory.b;

public class SenderFactory {

    public static Sender getSmsSender() {

        return new SmsSender();
    }

    public static Sender getMailSender() {

        return new MailSender();
    }
}
