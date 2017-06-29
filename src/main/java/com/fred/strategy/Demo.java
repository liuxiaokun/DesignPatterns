package com.fred.strategy;

/**
 * Created by fred on 6/29/17.
 */
public class Demo {

    public static void main(String[] args) {

        Strategy strategy = new RealStrategyA();

        Context context = new Context(strategy);

        context.contextInterface();

    }
}
