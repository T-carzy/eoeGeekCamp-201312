package com.eoe.oop.day02;

public class Test01 {
public static void main(String[] args) {
	Person02 p1=new Person02("韩伟",'女', 20, 1.60, "活泼的");
	Person02 p2=new Person02("韩伟",'女', 20, 1.60, "活泼的");
    System.out.println();
    if(p1.equals(p2)) {
		System.out.println("是同一个人");
	} else {
		System.out.println("不是同一个人");
	}
}
}

