package com.sz.ucar.命令模式.wrong;

/**
 * @author 梁宝昌
 * @time 2019-01-01 21:25
 * @email baochang.liang@ucarinc.com
 * @tel 3740
 * @desc 命令的实际执行者
 */
public class Receiver {
    public void DoA() {
        System.out.println("我收到了 A 命令,我执行了 A 命令");
    }

    public void DoB() {
        System.out.println("我收到了 B 命令,我执行了 B 命令");
    }
}
