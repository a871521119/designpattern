package com.sz.ucar.观察者.observer2;

public class Client {
    public static void main(String[] args) {
        ConcreteSubject subject=new ConcreteSubject();

        ObserverA observerA1=new ObserverA();
        ObserverA observerA2=new ObserverA();
        ObserverA observerA3=new ObserverA();

        subject.addObserver(observerA1);
        subject.addObserver(observerA2);
        subject.addObserver(observerA3);

        subject.setState(2018);

        System.out.println(observerA1.getMyState());
        System.out.println(observerA2.getMyState());
        System.out.println(observerA3.getMyState());
    }
}
