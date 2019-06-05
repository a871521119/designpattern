package com.sz.ucar.代理模式;

/**
 * @author zhang chao
 * @time 2018/12/18/018 17:15
 * @email chao.zhang12@ucarinc.com
 * @tel 2790
 * @desc 吃肉代理
 */
public class MeatProxy implements EatFoodWish {

    EatFoodWish eatFoodWish;

    public MeatProxy(EatFoodWish eatFoodWish) {
        this.eatFoodWish = eatFoodWish;
    }

    @Override
    public void eatFood() {
        System.out.println("去菜市场买肉");
        System.out.println("进厨房做肉");
        eatFoodWish.eatFood();
        System.out.println("收拾桌子洗碗\n");
    }

    @Override
    public void eatFood2() {

    }
}
