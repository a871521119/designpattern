package com.sz.ucar.复合模式;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author zhang chao
 * @time 2019/5/16/016 13:42
 * @email chao.zhang12@ucarinc.com
 * @tel 2790
 * @desc 人的集合
 */
public class ManSet implements Actionable {

    ArrayList<Actionable> list = new ArrayList<>();

    public void add(Actionable man){
        list.add(man);
    }

    @Override
    public void move() {
        Iterator iterator = list.iterator();
        while (iterator.hasNext()){
            Actionable man = (Actionable) iterator.next();
            man.move();
        }
    }
}
