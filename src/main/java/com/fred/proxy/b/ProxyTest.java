package com.fred.proxy.b;

/**
 * @author Fred Liu(liuxiaokun0410@gmail.com)
 * @version 1.7
 * @since 2016/12/9
 */
public class ProxyTest {

    public static void main(String[] args) {
        UserService userService = new UserServiceImpl();

        MyHandler invocationHandler = new MyHandler(userService);

        UserService proxy = (UserService) invocationHandler.getProxy();

        proxy.add();
    }
}
