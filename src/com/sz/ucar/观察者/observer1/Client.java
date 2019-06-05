package com.sz.ucar.观察者.observer1;

public class Client {

    public static void main(String[] args) {
        ConcreteSubject subject=new ConcreteSubject();

        ObserverA observerA1=new ObserverA();
        ObserverA observerA2=new ObserverA();
        ObserverA observerA3=new ObserverA();
        subject.registerObservers(observerA1);
        subject.registerObservers(observerA2);
        subject.registerObservers(observerA3);

        subject.setState(2019);

        subject.unregisterObservers(observerA3);
        subject.setState(2020);

        System.out.println(observerA1.getMyState());
        System.out.println(observerA2.getMyState());
        System.out.println(observerA3.getMyState());
    }
}
