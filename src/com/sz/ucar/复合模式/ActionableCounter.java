package com.sz.ucar.复合模式;

/**
 * @author zhang chao
 * @time 2019/5/15/015 18:12
 * @email chao.zhang12@ucarinc.com
 * @tel 2790
 * @desc 动作计数器
 */
public class ActionableCounter implements Actionable {

    private Actionable man;
    private int counts;

    public ActionableCounter(Actionable man) {
        this.man = man;
    }

    @Override
    public void move() {
        man.move();
        counts++;
        System.out.println("counts: " + counts);
    }

}
