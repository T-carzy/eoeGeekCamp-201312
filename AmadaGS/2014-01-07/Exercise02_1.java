package com.eoe.Oop.exercise;

import java.util.Scanner;

public class Exercise02_1 {

	
	public static void main(String[] args) {
		int x;
		int y;
		double Pi= 3.14;
		double circle;
		double area;
		Scanner sc=new Scanner(System.in);
		System.out.println("������X��Y��ֵ��");
	    x=sc.nextInt();
		y=sc.nextInt(); 
		System.out.println("������뾶r:");
		int r=sc.nextInt();
		circle=2*Pi*r;
		area=Pi*r*r;
		System.out.println("Բ�������ǣ�"+x+","+y+")");
		System.out.println("circle="+circle);
		System.out.println("area="+area);
		
	}

}
