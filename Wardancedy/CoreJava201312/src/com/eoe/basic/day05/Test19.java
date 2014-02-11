package com.eoe.basic.day05;

import java.util.Arrays;
import java.util.Scanner;

public class Test19 {
	/**
	 * 向数组中插入元素
	 */
	public static void main(String[] args) {
		String[] names={"张飞","王菲","刘亦飞","吗啡"};
		//显示插入前的数组
		System.out.println(Arrays.toString(names));
		Scanner scanner=new Scanner(System.in);
		System.out.println("输入插入的位置(1-4)");
		int index;
		do{
			index=scanner.nextInt();
		}while(index<1 || index>4);
		//names容量加1
		names=Arrays.copyOf(names, names.length+1);
		//index-1~names.length-1的元素依次后移
		for (int i =names.length-1;i>=index; i--) {
			names[i]=names[i-1];
		}
		//在index-1位置插入新的元素
		names[index-1]="咖啡";
		//显示插入后的数组
		System.out.println(Arrays.toString(names));
	}
}
