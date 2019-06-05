package com.sz.ucar.装饰模式.coffeebar.coffee;


import com.sz.ucar.装饰模式.coffeebar.Drink;

public  class Coffee extends Drink {

	@Override
	public float cost() {
		// TODO Auto-generated method stub
		return super.getPrice();
	}

	
}
