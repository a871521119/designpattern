package com.sz.ucar.备忘录模式.black;

/**
 * @author 梁宝昌
 * @time 2019-02-19 17:24
 * @email baochang.liang@ucarinc.com
 * @tel 3740
 * @desc 发起者
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
    public void restoreMemento(MemotoIF momIf) {
        this.setState(((Memento) momIf).getState());
        System.out.println("黑箱恢复 备忘录 状态：" + state);
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    private class Memento implements MemotoIF {

        private int state;

        public Memento(int state) {
            this.state = state;
            System.out.println("黑箱备忘录 当前保存 状态：" + state);
        }

        public int getState() {
            return state;
        }

        public void setState(int state) {

            this.state = state;
        }
    }
}
