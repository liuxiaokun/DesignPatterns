/**
 * @author Fred Liu <fredliu@augmentum.com.cn>
 * @version 1.6
 * @since Jan 26, 2015
 */
package com.fred.factory.c;

public class SmsFactory implements Factory {

    @Override
    public Sender getSender() {

        return new SmsSender();
    }

}
