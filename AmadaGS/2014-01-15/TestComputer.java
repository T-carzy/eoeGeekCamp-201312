package com.eoe.se1.day01;

import com.eoe.oop.day03.usb.Keyboard;
import com.eoe.oop.day03.usb.Mouse;
import com.eoe.oop.day03.usb.USB;
import com.eoe.oop.day03.usb.Udisk;
import com.ityw.se1.day01.entity.Computer;

public class TestComputer {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Computer computer =new Computer("ƻ������");
		computer.start();
		computer.usbs[0]=new Udisk();
		computer.usbs[1]=new Keyboard();
		computer.usbs[2]=new Mouse();
	    computer.usbs[3]=new USB(){

			@Override
			public void read() {
				System.out.println("ɨ���ǽ��û���������ݷ���������");
			}

			@Override
			public void write() {
				System.out.println("ɨ���ǽ����û����ļ�");
			}
	    };
	    computer.run();
	}

}
