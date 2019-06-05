package com.sz.ucar.复合模式;

/**
 * @author zhang chao
 * @time 2019/5/16/016 11:21
 * @email chao.zhang12@ucarinc.com
 * @tel 2790
 * @desc 抽象工厂
 */
public abstract class AbstractManFactory {

    /**
     * 创建小蓝人
     * @return
     */
    abstract Actionable createBlueMan();

    /**
     * 创建小红人
     * @return
     */
    abstract Actionable createRedMan();

}
