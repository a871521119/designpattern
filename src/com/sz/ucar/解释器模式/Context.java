package com.sz.ucar.解释器模式;

import java.util.HashMap;
import java.util.Map;

/**
 * @author weiting
 * @time 2019-05-07 10:01
 * @email ting.wei01@ucarinc.com
 * @tel
 * @desc 上下文类
 */
public class Context {
    private Map<Expression, Integer> map = new HashMap<>();

    /**
     * 定义变量
     * @param s
     * @param value
     */
    public void add(Expression s, Integer value) {
        map.put(s, value);
    }

    /**
     * 将变量转换成数字
     * @param s
     * @return
     */
    public int get(Expression s) {
        return map.get(s);
    }

}
