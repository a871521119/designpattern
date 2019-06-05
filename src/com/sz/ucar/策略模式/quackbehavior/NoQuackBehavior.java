package com.sz.ucar.策略模式.quackbehavior;


public	class NoQuackBehavior implements QuackBehavior
{

	@Override
	public void quack() {
		// TODO Auto-generated method stub
		System.out.println("__NoQuack__");
	}
	
}
