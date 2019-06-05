package com.sz.ucar.解释器模式;

/**
 * @author weiting
 * @time 2019-05-07 11:18
 * @email ting.wei01@ucarinc.com
 * @tel
 * @desc
 */
public class PlusOperation extends NonTerminalExpression{

    public PlusOperation(Expression e1, Expression e2) {
        super(e1, e2);
    }

    @Override
    public int interpreter(Context context) {
        return this.e1.interpreter(context) + this.e2.interpreter(context);
    }

}
