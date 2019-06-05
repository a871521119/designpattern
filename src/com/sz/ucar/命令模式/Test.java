package com.sz.ucar.命令模式;

import com.sz.ucar.命令模式.wrong.ConcreteCommandA;
import com.sz.ucar.命令模式.wrong.ConcreteCommandB;
import com.sz.ucar.命令模式.wrong.Invoker;
import com.sz.ucar.命令模式.wrong.Receiver;

public class Test {
    /**
     * 命令实际执行者
     */
    private static Receiver mReceiver;
    /**
     * 命令发送者
     */
    private static Invoker mInvoker;
    public static void main(String[] args) {
        mReceiver = new Receiver();
        mInvoker = new Invoker();
        mInvoker.setCommand(new ConcreteCommandA(mReceiver));
        mInvoker.RunCommand();
        mInvoker.setCommand(new ConcreteCommandB(mReceiver));
        mInvoker.RunCommand();
    }
}
