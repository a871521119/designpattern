package com.sz.ucar.命令模式.wrong;

/**
 * @author 梁宝昌
 * @time 2019-01-01 21:27
 * @email baochang.liang@ucarinc.com
 * @tel 3740
 * @desc Invoker：命令的请求者，是命令模式中最重要的角色。这个角色用来对各个命令进行控制。
 */
public class Invoker {
    private ICommand command = null;

    /**
     * @author 梁宝昌
     * @time 2019/1/1 21:28
     * @dec 设置命令
     */
    public void setCommand(ICommand command) {
        this.command = command;
    }

    /**
     * @author 梁宝昌
     * @time 2019/1/1 21:29
     * @dec 执行命令
     */
    public void RunCommand() {
        command.Execute();
    }
}
