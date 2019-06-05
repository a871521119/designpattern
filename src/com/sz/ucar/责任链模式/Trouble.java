package com.sz.ucar.责任链模式;

/**
 * 要处理的事件，
 */
public class Trouble {
    /**
     * 根据数值的不同，调用不同的执行者
     */
    private int number;

    public Trouble (int number){
        this.number = number;
    }

    public int getNumber() {
        return number;
    }
}
