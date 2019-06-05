package com.sz.ucar.装饰模式.coffeebar.decorator;


import com.sz.ucar.装饰模式.coffeebar.Drink;

public class Soy extends Decorator {

	public Soy(Drink Obj) {
		super(Obj);
		// TODO Auto-generated constructor stub
		super.setDescription("Soy");
		super.setPrice(1.5f);
	}

}

