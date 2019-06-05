package com.sz.ucar.解释器模式;

/**
 * @author weiting
 * @time 2019-05-07 10:15
 * @email ting.wei01@ucarinc.com
 * @tel
 * @desc 终结符表达式
 */
public class TerminalExpression implements Expression {
    String value;

    public TerminalExpression(String value) {
        this.value = value;
    }

    @Override
    public int interpreter(Context context) {
        return context.get(this);
    }
}
