package com.fengleiit.wow;

import com.fengleiit.swf.Person02;

public class Text1 {
	
public static void main(String[] args) {
	Person02 p1=new Person02();
	p1.name="��С��";
	p1.age=22;
	p1.height=1.8;
	p1.sex='��';
	Person02 p2=new Person02();
	p2.name="��С��";
	p2.age=22;
	p2.height=1.8;
	p2.sex='��';
	if(p1.equals(p2)){
		System.out.println("��һ����");
	}else{
		System.out.println("����һ����");
	}
	
}
}
