package com.sz.ucar.代理模式;

/**
 * @author zhang chao
 * @time 2018/12/18/018 17:00
 * @email chao.zhang12@ucarinc.com
 * @tel 2790
 * @desc 吃肉
 */
public class EatFoodImpl implements EatFoodWish {
    @Override
    public void eatFood() {
        System.out.println("******我只负责吃，其他与我无关*******");
    }

    @Override
    public void eatFood2() {
        System.out.println("******我只负责吃，其他与我无关222*******");
    }
}
