package com.sz.ucar.工厂模式.pizza;

public abstract class Pizza {
    /**
     * pizza名字
     */
    protected String name;

    /**
     * 准备
     */
    public abstract void prepare();

    /**
     * 烘培
     */
    public void bake() {
        System.out.println(name + " baking;");
    }

    /**
     * 切割
     */
    public void cut() {
        System.out.println(name + " cutting;");
    }

    /**
     * 装箱
     */
    public void box() {
        System.out.println(name + " boxing;");
    }

    public void setname(String name) {
        this.name = name;
    }
}
