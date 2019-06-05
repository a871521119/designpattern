package com.sz.ucar.策略模式.duck;


import com.sz.ucar.策略模式.flybehavior.BadFlyBehavior;
import com.sz.ucar.策略模式.quackbehavior.GeGeQuackBehavior;

public class RedHeadDuck extends Duck {

	public RedHeadDuck() {
		mFlyBehavior = new BadFlyBehavior();
		mQuackBehavior = new GeGeQuackBehavior();
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("**RedHead**");
	}

}
