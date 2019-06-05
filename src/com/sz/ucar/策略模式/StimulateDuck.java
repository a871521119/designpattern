package com.sz.ucar.策略模式;


import com.sz.ucar.策略模式.duck.Duck;
import com.sz.ucar.策略模式.duck.GreenHeadDuck;
import com.sz.ucar.策略模式.duck.RedHeadDuck;
import com.sz.ucar.策略模式.flybehavior.NoFlyBehavior;
import com.sz.ucar.策略模式.quackbehavior.NoQuackBehavior;

public class StimulateDuck {

	public static void main(String[] args) {

		Duck mGreenHeadDuck = new GreenHeadDuck();
		Duck mRedHeadDuck = new RedHeadDuck();

		mGreenHeadDuck.display();
		mGreenHeadDuck.Fly();
		mGreenHeadDuck.Quack();
		mGreenHeadDuck.swim();

		mRedHeadDuck.display();
		mRedHeadDuck.Fly();
		mRedHeadDuck.Quack();
		mRedHeadDuck.swim();

		mRedHeadDuck.SetFlyBehavoir(new NoFlyBehavior());
		mRedHeadDuck.Fly();
		mRedHeadDuck.SetQuackBehavoir(new NoQuackBehavior());
		mRedHeadDuck.Quack();
	}

}
