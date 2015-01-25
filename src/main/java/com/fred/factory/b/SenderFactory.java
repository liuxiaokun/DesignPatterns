/**
 * @author Fred Liu <fredliu@augmentum.com.cn>
 * @version 1.6
 * @since Jan 26, 2015
 */
package com.fred.factory.b;

public class SenderFactory {

    public Sender getSmsSender() {

        return new SmsSender();
    }

    public Sender getMailSender() {

        return new MailSender();
    }
}
