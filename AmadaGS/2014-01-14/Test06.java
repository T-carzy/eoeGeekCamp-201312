package com.eoe.se1.day01;

import com.eoe.oop.day03.usb.USB;
import com.eoe.oop.day03.usb.Udisk;
import com.ityw.se1.day01.entity.Computer;

public class Test06 {

	static Computer computer=new Computer();
	
	public static void main(String[] args) {
		
		Test06 t=new Test06();
		t.createScanner();
		
	}

	 void createScanner() {
		final StringBuilder scannerName=new StringBuilder();
		USB scanner=new USB(){

			@Override
			public void read() {
				System.out.println(scannerName+"��ɨ���ǵ����ݷ���������");
				
			}

			@Override
			public void write() {
				System.out.println(scannerName+"��ɨ���ļ�");
			}
		};
		computer.usbs[0]=scanner;
	}

}
