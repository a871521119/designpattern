package com.sz.ucar.工厂模式.pizza;

public class NYCheesePizza extends Pizza {

	@Override
	public void prepare() {
		// TODO Auto-generated method stub
		super.setname("NYCheesePizza");
		
		System.out.println(name+" preparing;");
	}

}
