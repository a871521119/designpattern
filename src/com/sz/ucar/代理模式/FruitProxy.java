package com.sz.ucar.代理模式;

/**
 * @author zhang chao
 * @time 2018/12/18/018 17:15
 * @email chao.zhang12@ucarinc.com
 * @tel 2790
 * @desc 吃肉代理
 */
public class FruitProxy implements EatFoodWish {

    EatFoodWish eatFoodWish;

    public FruitProxy(EatFoodWish eatFoodWish) {
        this.eatFoodWish = eatFoodWish;
    }

    @Override
    public void eatFood() {
        System.out.println("去菜市场买水果");
        System.out.println("进厨房切水果");
        eatFoodWish.eatFood();
        System.out.println("收拾桌子洗碗\n");
    }

    @Override
    public void eatFood2() {
        System.out.println("去菜市场买水果2222");
    }
}
