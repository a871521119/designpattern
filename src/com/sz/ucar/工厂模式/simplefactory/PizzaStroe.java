package com.sz.ucar.工厂模式.simplefactory;



public class PizzaStroe {
	public static void main(String[] args) {
		SimplePizzaFactory mSimplePizzaFactory;
		OrderPizza mOrderPizza;
		mOrderPizza=new	OrderPizza(new SimplePizzaFactory());
		
	}

	

}
