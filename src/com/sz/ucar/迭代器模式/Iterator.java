package com.sz.ucar.迭代器模式;
/**
 * @author weiting
 * @time 2019-01-15 09:59
 * @email ting.wei01@ucarinc.com
 * @tel
 * @desc 迭代器角色，定义遍历元素所需要的方法
 */
public interface Iterator {
    boolean hasNext();

    Object next();

}
