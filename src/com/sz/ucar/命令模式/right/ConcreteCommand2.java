package com.sz.ucar.命令模式.right;

/**
 * @author 梁宝昌
 * @time 2019-01-02 09:39
 * @email baochang.liang@ucarinc.com
 * @tel 3740
 * @desc 具体命令角色（ConcreteCommand）角色：是抽象命令类的具体实现类，它拥有接收者对象，并通过调用接收者的功能来完成命令要执行的操作
 */
public class ConcreteCommand2 extends Command {
    //哪个Receiver类进行命令处理
    private Receiver mReceiver;

    //构造函数传递接收者
    public ConcreteCommand2(Receiver receiver) {
        this.mReceiver = receiver;
    }

    //必须实现一个命令
    @Override
    public void execute() {
        //业务处理
        this.mReceiver.doSomething();
    }
}
