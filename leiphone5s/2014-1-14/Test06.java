package com.eoe.oop.se1.day01;

import com.eoe.oop.day03.entity.Computer;
import com.eoe.oop.day03.usb.USB;

public class Test06 {
static Computer computer=new Computer();
public static void main(String[] args) {
	Test06 t=new Test06();
	t.createScanner();
	computer.usbs[0].read();
	computer.usbs[0].write();
}
void createScanner(){
	final String scannerName="ɨ����";
	USB scanner=new USB() {
		//scannerName="ɨ����";
		@Override
		public void write() {
			// TODO Auto-generated method stub
			System.out.println("��ɨ�赽�����ݷ���������");
		}
		
		@Override
		public void read() {
			// TODO Auto-generated method stub
			System.out.println("����ɨ��ֽ���ļ�");
		}
	};
	computer.usbs[0]=scanner;
}
}
