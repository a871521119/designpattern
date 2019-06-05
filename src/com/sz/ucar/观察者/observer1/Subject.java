package com.sz.ucar.观察者.observer1;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * */
public class Subject {
    protected List<Observer> observers=new ArrayList();

    public void registerObservers(Observer observer){
        observers.add(observer);
    }

    public void unregisterObservers(Observer observer){
        observers.remove(observer);
    }

    public void notifyAllObservers(){
        for (Observer obs:observers) {
            obs.update(this);
        }
    }
}
