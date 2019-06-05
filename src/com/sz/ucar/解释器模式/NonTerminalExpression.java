package com.sz.ucar.解释器模式;

/**
 * @author weiting
 * @time 2019-05-07 10:06
 * @email ting.wei01@ucarinc.com
 * @tel
 * @desc 抽象非终结符表达式
 */
public abstract class NonTerminalExpression implements Expression {
    Expression e1, e2;

    public NonTerminalExpression(Expression e1, Expression e2) {
        this.e1 = e1;
        this.e2 = e2;
    }

}
