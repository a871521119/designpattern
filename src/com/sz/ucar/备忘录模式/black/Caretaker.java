package com.sz.ucar.备忘录模式.black;

/**
 * @author 梁宝昌
 * @time 2019-02-19 17:25
 * @email baochang.liang@ucarinc.com
 * @tel 3740
 * @desc 负责人角色类Caretaker能够得到的备忘录对象是以MementoIF为接口的，由于这个接口仅仅是一个标识接口，因此负责人角色不可能改变这个备忘录对象的内容。
 */
public class Caretaker {
    private MemotoIF memento;

    /**
     * 备忘录的取值方法
     */
    public MemotoIF retrieveMemento() {
        return this.memento;
    }

    /**
     * 备忘录的赋值方法
     */
    public void saveMemento(MemotoIF memento) {
        this.memento = memento;
    }
}
