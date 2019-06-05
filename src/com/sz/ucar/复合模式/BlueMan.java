package com.sz.ucar.复合模式;

/**
 * @author zhang chao
 * @time 2019/5/15/015 18:06
 * @email chao.zhang12@ucarinc.com
 * @tel 2790
 * @desc 小蓝人
 */
public class BlueMan implements Actionable {
    @Override
    public void move() {
        System.out.println("BlueMan jump");
    }
}
