package com.eoe.oop.day03.usb;

public class Println implements USB {
public void read(){
	System.out.println(USB.PRINTLN+"获取主机发送的打印内容");
}
public void write(){
	System.out.println(USB.PRINTLN+"在打印机上打印");
}
}
