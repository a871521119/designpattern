package com.sz.ucar.备忘录模式.more;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 梁宝昌
 * @time 2019-02-19 17:54
 * @email baochang.liang@ucarinc.com
 * @tel 3740
 * @desc
 */
public class Caretaker {
    private Originator o;
    private List<Memento> mementos = new ArrayList<Memento>();
    private int current;

    /**
     * 构造函数
     */
    public Caretaker(Originator o) {
        this.o = o;
        current = 0;
    }

    /**
     * 创建一个新的检查点
     */
    public int createMemento() {
        Memento memento = o.createMemento();
        mementos.add(memento);
        return current++;
    }

    /**
     * 将发起人恢复到某个检查点
     */
    public void restoreMemento(int index) {
        Memento memento = mementos.get(index);
        o.restoreMemento(memento);
    }

    /**
     * 将某个检查点删除
     */
    public void removeMemento(int index) {
        mementos.remove(index);
    }
}
