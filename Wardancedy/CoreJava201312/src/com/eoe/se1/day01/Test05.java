package com.eoe.se1.day01;

import com.eoe.oop.day03.usb.Keyboard;
import com.eoe.oop.day03.usb.Mouse;
import com.eoe.oop.day03.usb.USB;
import com.eoe.oop.day03.usb.Udisk;
import com.eoe.se1.day01.entity.Computer;

public class Test05 {
	public static void main(String[] args) {
		Computer pc=new Computer();
		pc.start();
		//���U��
		pc.usbs[0]=new Udisk();
		//���������
		pc.usbs[1]=new Keyboard();
		pc.usbs[2]=new Mouse();
		pc.usbs[3]=new USB() {
			
			@Override
			public void write(){
				System.out.println("ɨ���ǽ�ɨ������ݷ���������");
			}
			
			@Override
			public void read() {
				System.out.println("ɨ����ɨ��ֽ���ļ�");
			}
		};
		pc.run();
	}
}
