package com.sz.ucar.工厂模式.method;


import com.sz.ucar.工厂模式.pizza.NYCheesePizza;
import com.sz.ucar.工厂模式.pizza.NYPepperPizza;
import com.sz.ucar.工厂模式.pizza.Pizza;

public class NYOrderPizza extends OrderPizza {

	@Override
	Pizza createPizza(String ordertype) {
		Pizza pizza = null;

		if (ordertype.equals("cheese")) {
			pizza = new NYCheesePizza();
		} else if (ordertype.equals("pepper")) {
			pizza = new NYPepperPizza();
		}
		return pizza;

	}

}
