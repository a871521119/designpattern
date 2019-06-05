package com.sz.ucar.备忘录模式.white;

/**
 * @author 梁宝昌
 * @time 2019-02-19 17:04
 * @email baochang.liang@ucarinc.com
 * @tel 3740
 * @desc 发起者，负责备忘录的创建，修改，恢复
 */
public class Originator {
    private int state = 0;

    Caretaker caretaker = new Caretaker();

    public Memento creatMementoObject() {
        return new Memento(state);
    }

    /**
     * 将发起人恢复到备忘录对象所记载的状态
     */
    public void restoreMemento(Memento memento) {
        this.state = memento.getState();
        System.out.println("恢复 备忘录 状态：" + state);
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }
}
