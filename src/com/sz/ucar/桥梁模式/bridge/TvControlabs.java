package com.sz.ucar.桥梁模式.bridge;


import com.sz.ucar.桥梁模式.control.Control;

public abstract class TvControlabs {

	  Control mControl=null;
	public TvControlabs(Control mControl)
	{
		this.mControl=mControl;
	}
	
	public abstract void Onoff();
	public abstract void nextChannel();
	public abstract void preChannel();
	
	
}
