package com.sz.ucar.备忘录模式.white;

/**
 * @author 梁宝昌
 * @time 2019-02-19 17:03
 * @email baochang.liang@ucarinc.com
 * @tel 3740
 * @desc 备忘录，对发起者进行缓存的类
 */
public class Memento {
    private int state;

    public Memento() {
        super();
    }

    public Memento(int state) {
        this.state = state;
        System.out.println("备忘录 当前保存 状态：" + state);
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }
}
