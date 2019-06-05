package com.sz.ucar.工厂模式.absfactory;


import com.sz.ucar.工厂模式.pizza.NYCheesePizza;
import com.sz.ucar.工厂模式.pizza.NYPepperPizza;
import com.sz.ucar.工厂模式.pizza.Pizza;

public class NYFactory implements AbsFactory {

	
	@Override
	public Pizza CreatePizza(String ordertype) {
		Pizza pizza = null;

		if (ordertype.equals("cheese")) {
			pizza = new NYCheesePizza();
		} else if (ordertype.equals("pepper")) {
			pizza = new NYPepperPizza();
		}
		return pizza;

	}

}
