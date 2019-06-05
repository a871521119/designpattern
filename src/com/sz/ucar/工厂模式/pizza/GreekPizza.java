package com.sz.ucar.工厂模式.pizza;

public class GreekPizza extends Pizza {

	@Override
	public void prepare() {
		// TODO Auto-generated method stub
		super.setname("GreekPizza");
		
		System.out.println(name+" preparing;");
	}

}
