package com.eoe.oop.se1.day02;

import java.util.ArrayList;
import java.util.Scanner;//�ŷ�,���,�����,������

public class Test01 {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("������һ������:");
		String s1=scanner.next();
		ArrayList<String> names = new ArrayList<String>();
		names.add("�ŷ�");
		names.add("����");
		names.add("�����");
		names.add("����");
		if(names.contains(s1)==true){
			System.out.println("�Ǹü��ϵ�Ԫ��");
		}else{
			System.out.println("���Ǹü��ϵ�Ԫ��");
		}
		System.out.println();	
		for (int i = 0; i < names.size(); i++) {
			System.out.println(names.get(i));
		}
		System.out.println();
		names.set(2, "�����");
		for (String name : names) {
			System.out.println(name);
		}
		System.out.println();
		names.remove(1);
		System.out.println(names);
		names.removeAll(names);
		System.out.println();
		if(names.isEmpty()==true){
			System.out.println("����Ԫ��Ϊ��,�������");
		}else{
		names.removeAll(names);
		}
	}
	
}
