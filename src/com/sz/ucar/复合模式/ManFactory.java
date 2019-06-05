package com.sz.ucar.复合模式;

/**
 * @author zhang chao
 * @time 2019/5/16/016 11:23
 * @email chao.zhang12@ucarinc.com
 * @tel 2790
 * @desc
 */
public class ManFactory extends AbstractManFactory {

    @Override
    Actionable createBlueMan() {
        return new BlueMan();
    }

    @Override
    Actionable createRedMan() {
        return new RedManAdapter();
    }
}
