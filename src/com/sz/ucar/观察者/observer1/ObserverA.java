package com.sz.ucar.观察者.observer1;

public class ObserverA implements Observer {

    private int myState;

    public int getMyState() {
        return myState;
    }

    public void setMyState(int myState) {
        this.myState = myState;
    }
    @Override
    public void update(Subject subject) {
        myState=((ConcreteSubject)subject).getState();
    }
}
