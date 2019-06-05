package com.sz.ucar.代理模式;


import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @author zhang chao
 * @time 2018/12/19/019 17:10
 * @email chao.zhang12@ucarinc.com
 * @tel 2790
 * @desc
 */
public class CglibProxy implements MethodInterceptor {

    String type;

    public CglibProxy(String type) {
        this.type = type;
    }

    //给目标对象创建一个代理对象
    public Object getInstance(Class c) {
        //1.工具类
        Enhancer enhancer = new Enhancer();
        //2.设置父类
        enhancer.setSuperclass(c);
        //3.设置回调函数
        enhancer.setCallback(this);
        //4.创建子类(代理对象)
        return enhancer.create();
    }


    @Override
    public Object intercept(Object object, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
        System.out.println("去菜市场买" + type);
        System.out.println("进厨房做" + type);
        Object result = methodProxy.invokeSuper(object, args);
        System.out.println("收拾桌子洗碗\n");
        return result;
    }
}
