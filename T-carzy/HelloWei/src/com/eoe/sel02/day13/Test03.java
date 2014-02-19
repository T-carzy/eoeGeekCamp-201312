package com.eoe.sel02.day13;

import com.eoe.sel02.day13.view.View;

public class Test03 {
	public static void main(String[] args) {
		View v=new View();
		
		try {
			Class cla = Class.forName("com.eoe.sel02.day13.view.View");
			System.out.println(cla==v.getClass());
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
