package com.sz.ucar.备忘录模式.more;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 梁宝昌
 * @time 2019-02-19 17:54
 * @email baochang.liang@ucarinc.com
 * @tel 3740
 * @desc
 */
public class Memento {
    private List<String> states;
    private int index;
    /**
     * 构造函数
     */
    public Memento(List<String> states , int index){
        this.states = new ArrayList<String>(states);
        this.index = index;
    }
    public List<String> getStates() {
        return states;
    }
    public int getIndex() {
        return index;
    }
}
