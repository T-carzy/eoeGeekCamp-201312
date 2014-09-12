package com.eoe.oop.day02;

import com.eoe.oop.day01.Person;

public class Code03 {

	public Code03() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Person p1=new Person("项羽", '男', 32, 1.89, "豪放的");
Person p2=new Person("张飞", '男', 32, 1.87, "豪放的");
if(p1.equals(p2)){
	System.out.println("是一个人");
}else{
	System.out.println("不是一个人");
}
	}

}
