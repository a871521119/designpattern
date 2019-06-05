package com.sz.ucar.责任链模式;

/**
 * 第二个执行者
 */
public class Handler10 extends Handler {
    @Override
    protected String getName() {
        return "执行者10";
    }

    @Override
    protected boolean resolve(Trouble trouble) {
        return trouble.getNumber() <= 10;//执行条件
    }
}
