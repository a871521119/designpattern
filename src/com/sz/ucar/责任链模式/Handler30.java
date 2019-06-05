package com.sz.ucar.责任链模式;

public class Handler30 extends Handler {
    @Override
    protected String getName() {
        return "执行者30";
    }

    @Override
    protected boolean resolve(Trouble trouble) {
        return trouble.getNumber() <= 30;
    }
}
