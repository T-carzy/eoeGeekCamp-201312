package com.eoe.se1.day01;

import com.eoe.oop.day03.usb.USB;
import com.eoe.se1.day01.entity.Computer;

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
			//String scannerName="ɨ����";
			@Override
			public void write() {
				//scannerName="��ӡ��";
				System.out.println(scannerName+"��ɨ������ݷ���������");
			}
			
			@Override
			public void read() {
				System.out.println(scannerName+"����ɨ��ֽ���ļ�");
			}
		};
		computer.usbs[0]=scanner;
	}
	
}
