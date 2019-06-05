package com.sz.ucar.建造者模式;

public interface IBuildHuman {
    public void buildHead();
    public void buildBody();
    public void buildHand();
    public void buildFoot();
    public Human createHuman();
}
