package com.eoe.se1.day02;

import java.awt.peer.SystemTrayPeer;
import java.util.ArrayList;
import java.util.Scanner;

public class Test05 {
	public static void main(String[] args) {
		ArrayList<Integer> list=new ArrayList<Integer>();
		Scanner scanner=new Scanner(System.in);
		System.out.println("输入删除的整数");
		int i=scanner.nextInt();
		list.add(100);
		list.add(2);
		list.add(30);
		list.add(42);
		list.remove((Integer)i);
		System.out.println(list);
	}
}
