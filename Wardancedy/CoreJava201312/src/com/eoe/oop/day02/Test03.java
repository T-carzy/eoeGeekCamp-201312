package com.eoe.oop.day02;

public class Test03{
	/**
	 * Object类常用方法示例
	 * equals()
	 * toString()
	 */
	public static void main(String[] args) {
		Object o1=new Object();
		Object o2=new Object();
		//判断两个对象的地址是否相等
		if(o1.equals(o2)){
			System.out.println("同一个对象");
		}else{
			System.out.println("不是同一个对象");
		}
		//打印o1实际调用的是o1.toString()
		System.out.println("o1的值"+o1);
		//打印o2实际调用的是o2.toString()
		System.out.println("o2的值"+o2);
		o1=o2;//地址赋值
		//判断两个引用变量是否相等
		if(o1.equals(o2)){
			System.out.println("同一个对象");
		}else{
			System.out.println("不是同一个对象");
		}
		//打印两个引用变量的地址
		System.out.println("o1的值"+o1.toString());
		System.out.println("o2的值"+o2.toString());
	}

}
