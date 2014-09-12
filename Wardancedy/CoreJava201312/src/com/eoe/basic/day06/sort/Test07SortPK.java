package com.eoe.basic.day06.sort;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Test07SortPK {
	static final int SELECT_SORT=1;
	static final int BUBBLE_SORT=2;
	static final int INSERT_SORT=3;
	static final int QUICK_SORT=4;
	static final int COUNT_SORT=5;
	public static void main(String[] args) {
		System.out.println("1-—°‘Ò≈≈–Ú");
		System.out.println("2-√∞≈›≈≈–Ú");
		System.out.println("3-≤Â»Î≈≈–Ú");
		System.out.println("4-øÏÀŸ≈≈–Ú");
		System.out.println("5-º∆ ˝≈≈–Ú");
		System.out.println("—°‘Ò1°´5");
		int select=new Scanner(System.in).nextInt();
		switch (select) {
		case SELECT_SORT:
			selectSort();
			break;
		case BUBBLE_SORT:
			bubbleSort();
			break;
		case INSERT_SORT:
			insertSort();
			break;
		case QUICK_SORT:
			quickSort();
			break;
		case COUNT_SORT:
			countSort();
			break;
		}
	}
	// 2«ßÕÚ£¨63∫¡√Î
	private static void countSort() {
		int[] a=new int[20000000];
		Random random=new Random();
		for (int i = 0; i < a.length; i++) {
			a[i]=random.nextInt(101);
		}
		int[] b=new int[101];
		long start=System.currentTimeMillis();
		for (int i = 0; i < a.length; i++) {
			b[a[i]]++;
		}
		long end=System.currentTimeMillis();
		System.out.println("cost time:"+(end-start));
	}
	//2«ßÕÚ£¨1141∫¡√Î
	private static void quickSort() {
		int[] a=new int[20000000];
		Random random=new Random();
		for (int i = 0; i < a.length; i++) {
			a[i]=random.nextInt(101);
		}
		long start=System.currentTimeMillis();
		Arrays.sort(a);
		long end=System.currentTimeMillis();
		System.out.println("cost time:"+(end-start));
	}
	//20ÕÚ£∫19118∫¡√Î
	private static void insertSort() {
		int[] a=new int[200000];
		Random random=new Random();
		for (int i = 0; i < a.length; i++) {
			a[i]=random.nextInt(101);
		}
		long start=System.currentTimeMillis();
		for (int i = 1; i < a.length; i++) {
			int k=a[i];
			int j;
			for (j = i-1; j>=0&&k>a[j]; j--) {
				a[j+1]=a[j];
			}
			a[j+1]=k;
		}
		long end=System.currentTimeMillis();
		System.out.println("cost time:"+(end-start));
	}
	//20ÕÚ£∫57500∫¡√Î
	private static void bubbleSort() {
		int[] a=new int[200000];
		Random random=new Random();
		for (int i = 0; i < a.length; i++) {
			a[i]=random.nextInt(101);
		}
		long start=System.currentTimeMillis();
		for (int i = 1; i < a.length; i++) {
			for (int j = 0; j < a.length-i; j++) {
				if(a[j]<a[j+1]){
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		long end=System.currentTimeMillis();
		System.out.println("cost time:"+(end-start));
	}
	//20ÕÚ£∫21914
	private static void selectSort() {
		int[] a=new int[200000];
		Random random=new Random();
		for (int i = 0; i < a.length; i++) {
			a[i]=random.nextInt(101);
		}
		long start=System.currentTimeMillis();
		for (int i = 0; i < a.length-1; i++) {
			int index=i;
			for (int j = i+1; j < a.length; j++) {
				if(a[index]<a[j]){
					index=j;
				}
			}
			int temp=a[i];
			a[i]=a[index];
			a[index]=temp;
		}
		long end=System.currentTimeMillis();
		System.out.println("cost time:"+(end-start));
		//System.out.println(Arrays.toString(a));
	}
}
