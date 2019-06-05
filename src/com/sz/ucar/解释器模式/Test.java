package com.sz.ucar.解释器模式;

/**
 * @author weiting
 * @time 2019-05-07 10:20
 * @email ting.wei01@ucarinc.com
 * @tel
 * @desc 测试类
 */

public class Test {
    public static void main(String[] args) {
        Context context = new Context();
        TerminalExpression a = new TerminalExpression("a");
        TerminalExpression b = new TerminalExpression("b");
        TerminalExpression c = new TerminalExpression("c");

        context.add(a, 1);
        context.add(b, 2);
        context.add(c, 3);

        System.out.println(new MinusOperation(new MinusOperation(new PlusOperation(c, a), b),b).interpreter(context));
    }
}
