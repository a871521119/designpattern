package com.sz.ucar.代理模式;


import java.lang.reflect.Proxy;

/**
 * @author zhang chao
 * @time 2018/12/18/018 16:54
 * @email chao.zhang12@ucarinc.com
 * @tel 2790
 * @desc
 */
public class Test {
    public static void main(String[] args){
//        //静态代理
//        EatFoodWish efw1 = new EatFoodImpl();
//        MeatProxy meatProxy = new MeatProxy(efw1);
//        meatProxy.eatFood();
//        FruitProxy fruitProxy = new FruitProxy(efw1);
//        fruitProxy.eatFood();

        //动态代理
        EatFoodWish efw2 = new EatFoodImpl();
        EatFoodWish proxyObject = (EatFoodWish) Proxy.newProxyInstance(
                efw2.getClass().getClassLoader(),
                efw2.getClass().getInterfaces(),
                new DynamicProxyHandler(efw2, "牛肉"));
        proxyObject.eatFood();
        proxyObject.eatFood2();
//
//        //cglib代理
//        CglibProxy cglibProxy = new CglibProxy("排骨");
//        EatFood eatFoodCglibProxy = (EatFood) cglibProxy.getInstance(EatFood.class);
//        eatFoodCglibProxy.eatFood();

    }
}
