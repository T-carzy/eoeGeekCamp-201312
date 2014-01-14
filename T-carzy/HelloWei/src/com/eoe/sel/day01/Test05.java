package com.eoe.sel.day01;

import com.eoe.pre.oop.day03.entity.Keyboard;
import com.eoe.pre.oop.day03.entity.Mouse;
import com.eoe.pre.oop.day03.entity.USB;
import com.eoe.pre.oop.day03.entity.Udisk;

public class Test05 {

	public static void main(String[] args) {
			Computer pc=new Computer();
			pc.start();
			pc.usbs[0]=new Udisk();
			pc.usbs[1]=new Keyboard();
			pc.usbs[2]=new Mouse();
			pc.usbs[3]=new USB() {
				
				@Override
				public void write() {
						System.out.println("扫描仪将扫描的数据发送至主机");
				}
				
				@Override
				public void read() {
						System.out.println("扫描仪扫描纸质文件");
				}
			};
			pc.run();
	}

}
