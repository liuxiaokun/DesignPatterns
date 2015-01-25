/**
 * @author Fred Liu <fredliu@augmentum.com.cn>
 * @version 1.6
 * @since Jan 26, 2015
 */
package com.fred.factory.c;

public class MailSender implements Sender {

    @Override
    public void send(String content) {
        System.out.println("Mail send : " + content);
    }
}
