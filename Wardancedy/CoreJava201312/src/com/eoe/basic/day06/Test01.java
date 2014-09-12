package com.eoe.basic.day06;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Test01 {
	public static void main(String[] args) {
		System.out.println("1-—°‘Ò≈≈–Ú");
		System.out.println("2-√∞≈›≈≈–Ú");
		System.out.println("3-≤Â»Î≈≈–Ú");
		System.out.println("4-øÏÀŸ≈≈–Ú");
		System.out.println("5-Õ≥º∆≈≈–Ú");
		Scanner scanner=new Scanner(System.in);
		System.out.println("—°‘Ò1-5");
		int select=scanner.nextInt();
		switch (select) {
		case 1:
			selectSort();
			break;
		case 4:
			quickSort();
			break;
		case 5:
			countSort();
			break;
		}
	}

	private static void countSort() {
		Random random=new Random();
		int[] a=new int[200000];
		for (int i = 0; i < a.length; i++) {
			a[i]=random.nextInt(1000);
		}
		long start=System.currentTimeMillis();
		int[] b=new int[1000];
		for (int i = 0; i < a.length; i++) {
			b[a[i]]++;
		}
		long end=System.currentTimeMillis();
		System.out.println("cost time:"+(end-start));
	}

	private static void quickSort() {
		Random random=new Random();
		int[] a=new int[20000000];
		for (int i = 0; i < a.length; i++) {
			a[i]=random.nextInt(1000);
		}
		long start=System.currentTimeMillis();
		Arrays.sort(a);
		long end=System.currentTimeMillis();
		System.out.println("cost time:"+(end-start));
	}

	private static void selectSort() {
		Random random=new Random();
		int[] a=new int[200000];
		for (int i = 0; i < a.length; i++) {
			a[i]=random.nextInt(1000);
		}
		long start=System.currentTimeMillis();
		for(int i=0;i<a.length-1;i++){
			for (int j = i+1; j < a.length; j++) {
				if(a[i]<a[j]){
					swap(a,i,j);
				}
			}
			//System.out.println(Arrays.toString(a));
		}
		long end=System.currentTimeMillis();
		System.out.println("cost time:"+(end-start));
	}
	static void swap(int[] b, int i, int j) {
		b[i] += b[j];
		b[j] = b[i] - b[j];
		b[i] -= b[j];
	}
}
