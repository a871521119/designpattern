package com.sz.ucar.复合模式;

/**
 * @author zhang chao
 * @time 2019/5/15/015 18:08
 * @email chao.zhang12@ucarinc.com
 * @tel 2790
 * @desc
 */
public class Test {
    public static void main(String[] args){

        BlueMan blueMan = new BlueMan();
        blueMan.move();
        RedMan redMan = new RedMan();
        redMan.walk();

        System.out.println("=========适配器模式=========");
        RedManAdapter redManAdapter = new RedManAdapter();
        redManAdapter.move();

        System.out.println("=========装饰模式=========");
        ActionableCounter counter = new ActionableCounter(blueMan);
        counter.move();
        counter.move();

        System.out.println("=========工厂模式=========");
        ManFactory factory = new ManFactory();
        Actionable blueOtherMan = factory.createBlueMan();
        blueOtherMan.move();
        Actionable redOtherMan = factory.createRedMan();
        redOtherMan.move();

        System.out.println("=========组合模式+迭代器模式=========");
        ManSet set = new ManSet();
        set.add(blueOtherMan);
        set.add(redOtherMan);
        set.move();

    }
}
