package com.sz.ucar.责任链模式;

/**
 * 第三个执行者
 */
public class Handler20 extends Handler {
    @Override
    protected String getName() {
        return "执行者20";
    }

    @Override
    protected boolean resolve(Trouble trouble) {
        return trouble.getNumber() <= 20;
    }
}
