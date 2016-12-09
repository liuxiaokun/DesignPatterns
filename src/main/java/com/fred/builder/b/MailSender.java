package com.fred.builder.b;

/**
 * @author Fred Liu(liuxiaokun0410@gmail.com)
 * @version 1.7
 * @since 2016/12/9
 */
public class MailSender implements Sender {

    @Override
    public void send(String content) {
        System.out.println("Mail send :" + content);
    }

}
