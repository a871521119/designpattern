package com.sz.ucar.策略模式.oo;

public class StoneDuck extends Duck {

	@Override
	public void display() {
		System.out.println("**StoneDuck**");
	}

	public void Quack() {
		System.out.println("~~no gaga~~");
	}
	public void swim() {
		System.out.println("~~no swim~~");
	}
	
	public void Fly() {
		System.out.println("~~no fly~~");
	}
}
