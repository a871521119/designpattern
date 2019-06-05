package com.sz.ucar.代理模式;

import java.lang.reflect.Proxy;

/**
 * @author zhang chao
 * @time 2018/12/20/020 9:41
 * @email chao.zhang12@ucarinc.com
 * @tel 2790
 * @desc 测试用时
 */
public class TestTime {
    public static void main(String[] args){
        EatFoodWish em = new EatFoodImpl();
        long lastTime = System.currentTimeMillis();
        MeatProxy meatProxy = new MeatProxy(em);
        System.out.println("静态代理用时：" + (System.currentTimeMillis() - lastTime));

        lastTime = System.currentTimeMillis();
        EatFoodWish proxyObject = (EatFoodWish) Proxy.newProxyInstance(
                em.getClass().getClassLoader(),
                em.getClass().getInterfaces(),
                new DynamicProxyHandler(em, "牛肉"));
        System.out.println("动态代理用时：" + (System.currentTimeMillis() - lastTime));

        lastTime = System.currentTimeMillis();
        CglibProxy cglibProxy = new CglibProxy("排骨");
        EatFood eatFoodCglibProxy = (EatFood) cglibProxy.getInstance(EatFood.class);
        System.out.println("Cglib代理用时：" + (System.currentTimeMillis() - lastTime));
    }
}
