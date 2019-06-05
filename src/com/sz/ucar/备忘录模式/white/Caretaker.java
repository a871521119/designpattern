package com.sz.ucar.备忘录模式.white;

/**
 * @author 梁宝昌
 * @time 2019-02-19 17:02
 * @email baochang.liang@ucarinc.com
 * @tel 3740
 * @desc 管理者，负责发起者的管理
 */
public class Caretaker {
    private Memento memento;

    /**
     * 备忘录的取值方法
     */
    public Memento retrieveMemento() {
        return this.memento;
    }

    /**
     * 备忘录的赋值方法
     */
    public void saveMemento(Memento memento) {
        this.memento = memento;
    }
}
