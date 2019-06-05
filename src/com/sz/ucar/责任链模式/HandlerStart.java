package com.sz.ucar.责任链模式;

/**
 * 第一个执行者
 */
public class HandlerStart extends Handler {
    @Override
    protected String getName() {
        return "执行者0";
    }

    @Override
    protected boolean resolve(Trouble trouble) {
        return false;//只做执行的发起者，不做任何业务处理，所以不需要改变
    }
}
