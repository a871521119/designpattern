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
public class Originator {
    private List<String> states;
    // 检查点指数
    private int index;

    /**
     * 构造函数
     */
    public Originator() {
        states = new ArrayList<String>();
        index = 0;
    }

    /**
     * 工厂方法，返还一个新的备忘录对象
     */
    public Memento createMemento() {
        return new Memento(states, index);
    }

    /**
     * 将发起人恢复到备忘录对象记录的状态上
     */
    public void restoreMemento(Memento memento) {
        states = memento.getStates();
        index = memento.getIndex();
    }

    /**
     * 状态的赋值方法
     */
    public void setState(String state) {
        states.add(state);
        index++;
    }

    /**
     * 辅助方法，打印所有状态
     */
    public void printStates() {
        for (String state : states) {
            System.out.println(state);
        }
        System.out.println(index+"");
    }
}
