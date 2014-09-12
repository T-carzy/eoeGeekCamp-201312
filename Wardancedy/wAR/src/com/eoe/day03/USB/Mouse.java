package com.eoe.day03.USB;

public class Mouse implements USB {
	@Override
public void read(){
	System.out.println(USB.MOUSE+"读取用户数据");
}
	@Override
	public void write() {
		// TODO Auto-generated method stub
		System.out.println(USB.MOUSE+"将数据传送给主机");
	}
}
