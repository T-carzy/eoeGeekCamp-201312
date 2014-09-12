package com.eoe.day03.action;

import com.eoe.day03.USB.USB;

public class Company implements Action, USB {

	@Override
	public void run() {
		// TODO Auto-generated method stub
System.out.println(Action.COMPANY+"在运作....");
	}

	@Override
	public void read() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void write() {
		// TODO Auto-generated method stub
		
	}
}
