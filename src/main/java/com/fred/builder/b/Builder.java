package com.fred.builder.b;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Fred Liu(liuxiaokun0410@gmail.com)
 * @version 1.7
 * @since 2016/12/9
 */
public class Builder {

    private List<Sender> senders = new ArrayList<>();

    public void produceMailSender(int quantity) {

        for (int i = 0; i < quantity; i++) {
            senders.add(new MailSender());
        }
    }


    public void produceSmsSender(int quantity) {

        for (int i = 0; i < quantity; i++) {
            senders.add(new SmsSender());
        }
    }
}
