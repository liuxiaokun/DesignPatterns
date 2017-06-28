package com.fred.observer;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by fred on 6/28/17.
 */
public class RealSubject implements Subject {

    private Set<Observer> observers = new HashSet<>();

    @Override
    public void attach(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void detach(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers(String message) {

        for (Observer observer : observers) {
            observer.notifyMe(message);
        }
    }
}
