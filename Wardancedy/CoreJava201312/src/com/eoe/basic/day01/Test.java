package com.eoe.basic.day01;

import java.util.Scanner;
/**
 * ��ӡѭ�������㷨
 * @author yw
 *
 */
public class Test {
	static final int RIGHT=0;//����Ԫ�صڶ����±��1
	static final int DOWN=1;//����Ԫ�ص�һ���±��1
	static final int LEFT=2;//�ڶ����±��1
	static final int TOP=3;//��һ���±��1
	public static void main(String[] args) {
		//�����ĸ����������
		Direction[] d=new Direction[4];
		initDirection(d);//��ʼ����d����
		Scanner scanner=new Scanner(System.in);
		System.out.println("n=");
		int n=scanner.nextInt();
		int[][] a=new int[n][n];
		int value=1;
		//���ѭ��������������Ĳ���
		for(int i=0;i<=n/2;i++){
			int x=i;//x����ÿ���ʼ����Ԫ�صĺ����±�
			int y=i;//y����ÿ���ʼ����Ԫ�ص������±�
			for(int k=RIGHT;k<=TOP;k++){//�ĸ������ѭ��
				//ÿ������ѭ����ֵ
				for(int j=0;j<n-2*i-1;j++){
					a[y][x]=value;//��ֵ
					x+=d[k].x;//����Ԫ�غ�����ֵ�ı��
					y+=d[k].y;//����Ԫ��������ֵ�ı��
					value++;//valueֵ����
				}
			}
		}
		if(n%2==1){
			a[n/2][n/2]=n*n;//��ά����������Ԫ�صĸ�ֵ
		}
		//��ӡ���
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				if(a[i][j]<10){
					System.out.print(" ");
				}
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
	}
	/**
	 *    d[RIGHT]��������Ԫ���±������1�����򲻱䣬��d.x=1,d.y=0;
	 *    d[DOWN]��������Ԫ���±���򲻱䡢������1����d.x=0,d.y=1;
	 *    d[LEFT]��������Ԫ���±�����1�����򲻱䣬��d.x=-1,d.y=0;
	 *    d[TOP]��������Ԫ���±���򲻱䡢�����1����d.x=0,d.y=-1;
	 */
	static void initDirection(Direction[] d) {
		//��һ������Ԫ�أ����ƶ�ά�����е���1���в���
		d[RIGHT]=new Direction();
		d[RIGHT].x=1;//����1
		d[RIGHT].y=0;
		//�ڶ���Ԫ�أ���ά�����һ���±�(��)��1���в���
		d[DOWN]=new Direction();
		d[DOWN].x=0;
		d[DOWN].y=1;
		//d[3]��ά����ڶ����±�(��)��1����һ���±�(��)����
		d[LEFT]=new Direction();
		d[LEFT].x=-1;
		d[LEFT].y=0;
		//���ĸ�Ԫ�أ���ά����ĵ�һ���±�(��)��1���в���
		d[TOP]=new Direction();
		d[TOP].x=0;
		d[TOP].y=-1;
	}
	//Direction������Ϊ��ά����Ԫ���±�����
	static class Direction{
		int x;//�ڶ����±꣬�е�����
		int y;//��һ���±꣬�е�����
	}
}
