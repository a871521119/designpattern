package com.sz.ucar.策略模式.duck;


import com.sz.ucar.策略模式.flybehavior.GoodFlyBehavior;
import com.sz.ucar.策略模式.quackbehavior.GaGaQuackBehavior;

public class GreenHeadDuck extends Duck {

	public GreenHeadDuck() {
		mFlyBehavior = new GoodFlyBehavior();
		mQuackBehavior = new GaGaQuackBehavior();
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("**GreenHead**");
	}

}