package com.eoe.oop.day03.usb;

public class Mouse implements USB{
public void read(){
	System.out.println(USB.MOUSE+"接受用户的移动，点击操作");
}
public void write(){
	System.out.println(USB.MOUSE+"将用户的移动，点击操作发送至主机");
}
}
