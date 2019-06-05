package com.sz.ucar.桥梁模式.bridge;


import com.sz.ucar.桥梁模式.control.LGControl;
import com.sz.ucar.桥梁模式.control.SharpControl;
import com.sz.ucar.桥梁模式.control.SonyControl;

public class MainTest {
	public static void main(String[] args) {
		TvControl mLGTvControl;
		TvControl mSonyTvControl;
		mSonyTvControl=new TvControl(new SonyControl());
		mLGTvControl=new TvControl(new LGControl());
		mLGTvControl.Onoff();
		mLGTvControl.nextChannel();
		mLGTvControl.nextChannel();
		mLGTvControl.preChannel();
		mLGTvControl.Onoff();
		
		mSonyTvControl.Onoff();
		mSonyTvControl.preChannel();
		mSonyTvControl.preChannel();
		mSonyTvControl.preChannel();
		mSonyTvControl.Onoff();
		
		newTvControl mSharpTvControl;
		mSharpTvControl=new newTvControl(new SharpControl());
		mSharpTvControl.Onoff();
		mSharpTvControl.nextChannel();
		mSharpTvControl.setChannel(9);
		mSharpTvControl.setChannel(28);
		mSharpTvControl.Back();
		mSharpTvControl.Onoff();
		
	}


}
