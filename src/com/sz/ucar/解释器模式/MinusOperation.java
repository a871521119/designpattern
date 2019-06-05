package com.sz.ucar.解释器模式;

/**
 * @author weiting
 * @time 2019-05-07 10:13
 * @email ting.wei01@ucarinc.com
 * @tel
 * @desc 减法表达式实现类
 */
public class MinusOperation extends NonTerminalExpression {
    public MinusOperation(Expression e1, Expression e2) {
        super(e1, e2);
    }

    @Override
    public int interpreter(Context context) {
        return this.e1.interpreter(context) - this.e2.interpreter(context);
    }
}
