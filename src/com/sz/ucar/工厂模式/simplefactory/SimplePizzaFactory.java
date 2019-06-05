package com.sz.ucar.工厂模式.simplefactory;


import com.sz.ucar.工厂模式.pizza.CheesePizza;
import com.sz.ucar.工厂模式.pizza.GreekPizza;
import com.sz.ucar.工厂模式.pizza.PepperPizza;
import com.sz.ucar.工厂模式.pizza.Pizza;

public class SimplePizzaFactory {
	/**
	 * 抽取可变化的部分，保留不变化的部分
	 * @param ordertype
	 * @return
	 */
	public Pizza CreatePizza(String ordertype) {
		Pizza pizza = null;

		if (ordertype.equals("cheese")) {
			pizza = new CheesePizza();
		} else if (ordertype.equals("greek")) {
			pizza = new GreekPizza();
		} else if (ordertype.equals("pepper")) {
			pizza = new PepperPizza();
		}
		return pizza;

	}

}
