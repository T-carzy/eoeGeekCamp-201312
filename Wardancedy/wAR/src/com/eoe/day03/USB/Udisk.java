package com.eoe.day03.USB;

public class Udisk implements USB {
	@Override
public void read(){
	System.out.println(USB.UDISK+"接受用户的移动，和点击数据");
}
	@Override
public void write(){
	System.out.println(USB.UDISK+"传送数据给主机");
}
}
