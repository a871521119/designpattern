package com.sz.ucar.访问者模式;

//抽象元素
public abstract class IEmployee {
	//接收访问者
	public abstract void accept(IVisitor visitor);
}
