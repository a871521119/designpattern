package com.sz.ucar.命令模式.wrong;

/**
 * @author 梁宝昌
 * @time 2019-01-01 21:21
 * @email baochang.liang@ucarinc.com
 * @tel 3740
 * @desc ConcreteCommand：Command接口的实现者，用来执行具体的命令，某些情况下可以直接用来充当Receiver。
 */
public class ConcreteCommandA implements ICommand {

    private Receiver receiver = null;

    public ConcreteCommandA(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void Execute() {
        this.receiver.DoA();
    }
}
