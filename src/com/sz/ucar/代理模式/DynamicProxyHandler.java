package com.sz.ucar.代理模式;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author zhang chao
 * @time 2018/12/18/018 18:06
 * @email chao.zhang12@ucarinc.com
 * @tel 2790
 * @desc
 */
public class DynamicProxyHandler implements InvocationHandler {

    EatFoodWish eatFoodWish;
    String type;

    public DynamicProxyHandler(EatFoodWish eatFoodWish, String type) {
        this.eatFoodWish = eatFoodWish;
        this.type = type;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("去菜市场买" + type);
        System.out.println("进厨房做" + type);
        Object result = method.invoke(eatFoodWish, args);
        System.out.println("收拾桌子洗碗\n");
        

        return result;
    }
}
