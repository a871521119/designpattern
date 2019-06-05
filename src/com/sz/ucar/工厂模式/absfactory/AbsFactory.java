package com.sz.ucar.工厂模式.absfactory;


import com.sz.ucar.工厂模式.pizza.Pizza;

public interface AbsFactory {
    Pizza CreatePizza(String ordertype);
}
