package com.sz.ucar.命令模式.right;

/**
 * @author 梁宝昌
 * @time 2019-01-02 09:36
 * @email baochang.liang@ucarinc.com
 * @tel 3740
 * @desc 具体Receiver类 实现者/接收者（Receiver）角色：执行命令功能的相关操作，是具体命令对象业务的真正实现者。
 */
public class ConcreteReciver1 extends Receiver {
    //每个接收者都必须处理一定的业务逻辑
    @Override
    public void doSomething() {
        System.out.println("接收者1具体执行命令...");
    }
}
