package com.sz.ucar.装饰模式.coffeebar.decorator;


import com.sz.ucar.装饰模式.coffeebar.Drink;

public class Milk extends Decorator {

	public Milk(Drink Obj) {
		super(Obj);
		// TODO Auto-generated constructor stub
		super.setDescription("Milk");
		super.setPrice(2.0f);
	}

}

