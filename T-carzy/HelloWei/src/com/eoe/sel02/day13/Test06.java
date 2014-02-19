package com.eoe.sel02.day13;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

import com.eoe.sel02.day13.view.View;

/*
 * 通过反射调用构造器创建对象
 * 通过反射调用构造器按以下三种方式创建对象，
     1-带所有参数的构造器创建对象；
     2-无参构造器创建对象；
     3-带一个参数的构造器创建对象。
 */
public class Test06 {
	static final String PACKAGE="com.eoe.sel02.day13.view.View";
	public static void main(String[] args) {
		try {
			Class clazz=Class.forName(PACKAGE);
			Constructor c=clazz.getConstructor();
			View v=(View) c.newInstance();
			v.setBackgorund("黑色");
			v.setId("@+id/view");
			v.setLayout_height("200dp");
			v.setLayout_width("300dp");
			System.out.println(v);
			c=clazz.getDeclaredConstructor(String.class);
			c.setAccessible(true);
			v=(View) c.newInstance("白色");
			System.out.println(v);
			c=clazz.getConstructor(String.class,String.class,String.class,String.class);
			v=(View) c.newInstance("@+id.view","300","200","蓝色");
			System.out.println(v);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
