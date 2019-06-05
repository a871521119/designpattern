package com.sz.ucar.状态模式;

public class Client {
	public static void main(String[] args) {
		HomeContext ctx = new HomeContext();
		
//		ctx.setState(new FreeState());
		ctx.setState(new BookedState());
		
	}
}
