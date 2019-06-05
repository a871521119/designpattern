package com.sz.ucar.备忘录模式.black;


/**
 * @author 梁宝昌
 * @time 2019-02-19 17:26
 * @email baochang.liang@ucarinc.com
 * @tel 3740
 * @desc
 */
public class BlackTest {
    public static void main(String[] args) {
        test();
    }
    public static void test() {
        int state = 3;
        Originator originator = new Originator();
        Caretaker caretaker = new Caretaker();

        originator.setState(state);
        /**
         * 创建备忘录对象的 并将发起人对象的状态缓存起来
         */
        caretaker.saveMemento(originator.creatMementoObject());
        /*
         * 进行设置重新还原
         */
        originator.setState(5);
        System.out.println(" 黑箱发起人更改状态：" + originator.getState());
        //恢复发起人对象的状态
        originator.restoreMemento(caretaker.retrieveMemento());
    }

}