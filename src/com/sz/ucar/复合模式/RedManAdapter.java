package com.sz.ucar.复合模式;

/**
 * @author zhang chao
 * @time 2019/5/15/015 18:09
 * @email chao.zhang12@ucarinc.com
 * @tel 2790
 * @desc 小红人适配器
 */
public class RedManAdapter extends RedMan implements Actionable {

    @Override
    public void move() {
        walk();
    }
}
