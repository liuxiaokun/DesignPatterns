/**
 * @author Fred Liu <fredliu@augmentum.com.cn>
 * @version 1.6
 * @since Jan 26, 2015
 */
package com.fred.builder.a;

public class Main {

    public static void main(String[] args) {

        User user = new User.Builder("Fred", "password").age(1).avatar("http://www.baidu.com").build();

        System.out.println(user);
    }
}
