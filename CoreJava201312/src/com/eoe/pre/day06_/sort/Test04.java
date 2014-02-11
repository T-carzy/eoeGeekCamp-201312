package com.eoe.pre.day06_.sort;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
//����PK
public class Test04 {
	public static void main(String[] args) {
		System.out.println("1-ð������");
		System.out.println("2-ѡ������");
		System.out.println("3-��������");
		System.out.println("4-��������");
		System.out.println("5-�����������");
		Scanner scanner=new Scanner(System.in);
		System.out.println("��ѡ��1-4");
		int select=scanner.nextInt();
		switch (select) {
		case 1://ð������
			bubbleSort();
			break;
		case 2://ѡ������
			selectSort();
			break;
		case 3://��������
			insertSort();
			break;
		case 4:
			quickSort();//��������
			break;
		case 5:
			countSrot();
		}
	}
	private static void countSrot() {
		//a={0,5,0,4,2,3,1,5,4}
		//b={2,1,1,1,2,2}
		int[] a=new int[200000000];
		Random random=new Random();
		//��ȡϵͳ��ǰʱ�䣬��λ������
		for (int i = 0; i < a.length; i++) {
			a[i]=random.nextInt(1000);
		}
		//System.out.println(Arrays.toString(a));
		int[] b=new int[1000];
		long start=System.currentTimeMillis();
		for(int i=0;i<a.length;i++){
			b[a[i]]++;
		}
		long end=System.currentTimeMillis();
		System.out.println("cost time:"+(end-start)/1000+"��");
//		for(int i=0;i<b.length;i++){
//			for(int j=1;j<=b[i];j++){
//				System.out.print(i+" ");
//			}
//		}
	}
	private static void insertSort() {
		int[] a=new int[200000];
		Random random=new Random();
		//��ȡϵͳ��ǰʱ�䣬��λ������
		for (int i = 0; i < a.length; i++) {
			a[i]=random.nextInt();
		}
		//System.out.println(Arrays.toString(a));
		long start=System.currentTimeMillis();
		for(int i=1;i<a.length;i++){
			int k=a[i];
			int j;
			for(j=i-1;j>=0&&k>a[j];j--){
				a[j+1]=a[j];
			}
			a[j+1]=k;
		}
		long end=System.currentTimeMillis();
		System.out.println("cost time:"+(end-start)/1000+"��");
		//System.out.println(Arrays.toString(a));
	}
	private static void bubbleSort() {
		int[] a=new int[200000];
		Random random=new Random();
		//��ȡϵͳ��ǰʱ�䣬��λ������
		for (int i = 0; i < a.length; i++) {
			a[i]=random.nextInt(101);
		}
		//System.out.println(Arrays.toString(a));
		long start=System.currentTimeMillis();
		for(int i=1;i<a.length;i++){
			for(int j=0;j<a.length-i;j++){
				if(a[j]<a[j+1]){
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		long end=System.currentTimeMillis();
		System.out.println("cost time:"+(end-start)/1000+"��");
		//System.out.println(Arrays.toString(a));
	}
	//ð������
	private static void selectSort() {
		int[] a=new int[200000];
		Random random=new Random();
		//��ȡϵͳ��ǰʱ�䣬��λ������
		for (int i = 0; i < a.length; i++) {
			a[i]=random.nextInt(101);
		}
		//{3,2,7,6,8,10}
		//System.out.println(Arrays.toString(a));
		long start=System.currentTimeMillis();
		for(int i=0;i<a.length;i++){
			for(int j=i+1;j<a.length;j++){
				if(a[i]<a[j]){
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		long end=System.currentTimeMillis();
		System.out.println("cost time:"+(end-start)/1000+"��");
		//System.out.println(Arrays.toString(a));
	}

	static void quickSort() {
		int[] a=new int[20000000];
		Random random=new Random();
		//��ȡϵͳ��ǰʱ�䣬��λ������
		for (int i = 0; i < a.length; i++) {
			a[i]=random.nextInt();
		}
		long start=System.currentTimeMillis();
		Arrays.sort(a);
		long end=System.currentTimeMillis();
		System.out.println("cost time:"+(end-start)/1000+"��");
		for(int i=0;i<50;i++){
			System.out.println(a[i]);
		}
	}
}
