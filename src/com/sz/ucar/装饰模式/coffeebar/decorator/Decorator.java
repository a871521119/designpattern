package com.sz.ucar.装饰模式.coffeebar.decorator;


import com.sz.ucar.装饰模式.coffeebar.Drink;

public  class Decorator extends Drink {
	private Drink Obj;

	public Decorator(Drink Obj){
		this.Obj=Obj;
	};
	
	
	@Override
	public float cost() {
		// TODO Auto-generated method stub
		
		return super.getPrice()+Obj.cost();
	}

	@Override
	public String getDescription()
	{
		return super.description+"-"+super.getPrice()+"&&"+Obj.getDescription();
	}
	
	}
