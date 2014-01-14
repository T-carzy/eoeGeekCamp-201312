package com.eoe.sel.day01.basic;

import com.eoe.pre.oop.day03.entity.Keyboard;
import com.eoe.pre.oop.day03.entity.Mouse;
import com.eoe.pre.oop.day03.entity.Udisk;

public class TestComputer {

	
	public static void main(String[] args) {
			Computer c=new Computer();
			c.start();
			c.usbs[0]=new Udisk();
			c.usbs[1]=new Keyboard();
			c.usbs[2]=new Mouse();
			c.run();
	}

}
