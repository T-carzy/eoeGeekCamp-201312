package com.eoe.oop.day03.usb;

public  class Udisk implements USB {

public void read(){
	System.out.println(USB.UDISK+"读取主机发送的数据");

	}
public void write(){
	System.out.println(USB.UDISK+"相主机发送数据");
}

}
