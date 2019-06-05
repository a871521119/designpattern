package com.sz.ucar.备忘录模式.more;


/**
 * @author 梁宝昌
 * @time 2019-02-19 17:56
 * @email baochang.liang@ucarinc.com
 * @tel 3740
 * @desc
 */
public class MoreTest {
    public static void main(String[] args) {
        test();
    }
    public static void test() {
        Originator o = new Originator();
        Caretaker c = new Caretaker(o);
        // 改变状态
        o.setState("state 0");
        // 建立一个检查点
        c.createMemento();
        // 改变状态
        o.setState("state 1");
        // 建立一个检查点
        c.createMemento();
        // 改变状态
        o.setState("state 2");
        // 建立一个检查点
        c.createMemento();
        // 改变状态
        o.setState("state 3");
        // 建立一个检查点
        c.createMemento();
        // 打印出所有检查点
        o.printStates();
        System.out.println("-----------------恢复检查点-----------------");
        // 恢复到第二个检查点
        c.restoreMemento(1);
        // 打印出所有检查点
        o.printStates();
    }

}