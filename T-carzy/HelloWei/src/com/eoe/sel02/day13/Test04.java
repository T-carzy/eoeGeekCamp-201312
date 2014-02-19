package com.eoe.sel02.day13;

import java.lang.reflect.Constructor;

public class Test04 {
	static final String PACKAGE="com.eoe.sel02.day13.view.View";
	public static void main(String[] args) {
		try {
			Class clazz=Class.forName(PACKAGE);
			Constructor[] c=clazz.getDeclaredConstructors();
			for (Constructor constructor : c) {
				System.out.println(constructor);
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
