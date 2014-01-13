package com.eoe.oop.day03.usb;

public class Keyboard  implements USB{
public void read(){
	System.out.println(USB.KEYBOARD+"接受用户的输入数据");
}
public void write(){
	System.out.println(USB.KEYBOARD+"将用户的输入数据发送至主机");
}
}
