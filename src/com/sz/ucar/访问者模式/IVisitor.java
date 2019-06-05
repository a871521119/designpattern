package com.sz.ucar.访问者模式;
//抽象访问者
public abstract class IVisitor {
	 // 接收数据，进行业务处理。
	 public abstract void visit(FullTimeEmployee employee);
     public abstract void visit(PartTimeEmployee employee);
}
