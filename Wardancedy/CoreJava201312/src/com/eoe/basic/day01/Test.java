package com.eoe.basic.day01;

import java.util.Scanner;
/**
 * 打印循环方阵算法
 * @author yw
 *
 */
public class Test {
	static final int RIGHT=0;//数组元素第二个下标加1
	static final int DOWN=1;//数组元素第一个下标加1
	static final int LEFT=2;//第二个下标减1
	static final int TOP=3;//第一个下标减1
	public static void main(String[] args) {
		//代表四个方向的数组
		Direction[] d=new Direction[4];
		initDirection(d);//初始化化d数组
		Scanner scanner=new Scanner(System.in);
		System.out.println("n=");
		int n=scanner.nextInt();
		int[][] a=new int[n][n];
		int value=1;
		//外层循环控制整个方阵的层数
		for(int i=0;i<=n/2;i++){
			int x=i;//x代表每层初始数组元素的横向下标
			int y=i;//y代表每层初始数组元素的纵向下标
			for(int k=RIGHT;k<=TOP;k++){//四个方向的循环
				//每个方向循环赋值
				for(int j=0;j<n-2*i-1;j++){
					a[y][x]=value;//赋值
					x+=d[k].x;//数组元素横坐标值的变更
					y+=d[k].y;//数组元素纵坐标值的变更
					value++;//value值递增
				}
			}
		}
		if(n%2==1){
			a[n/2][n/2]=n*n;//二维数组最中心元素的赋值
		}
		//打印结果
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
	 *    d[RIGHT]代表数组元素下标横向增1、纵向不变，即d.x=1,d.y=0;
	 *    d[DOWN]代表数组元素下标横向不变、纵向增1，即d.x=0,d.y=1;
	 *    d[LEFT]代表数组元素下标横向减1、纵向不变，即d.x=-1,d.y=0;
	 *    d[TOP]代表数组元素下标横向不变、纵向减1，即d.x=0,d.y=-1;
	 */
	static void initDirection(Direction[] d) {
		//第一个数组元素，控制二维数组列的增1，行不动
		d[RIGHT]=new Direction();
		d[RIGHT].x=1;//列增1
		d[RIGHT].y=0;
		//第二个元素，二维数组第一个下标(行)增1，列不动
		d[DOWN]=new Direction();
		d[DOWN].x=0;
		d[DOWN].y=1;
		//d[3]二维数组第二个下标(列)减1，第一个下标(行)不动
		d[LEFT]=new Direction();
		d[LEFT].x=-1;
		d[LEFT].y=0;
		//第四个元素，二维数组的第一个下标(行)减1，列不动
		d[TOP]=new Direction();
		d[TOP].x=0;
		d[TOP].y=-1;
	}
	//Direction类用于为二维数组元素下标增减
	static class Direction{
		int x;//第二个下标，列的增减
		int y;//第一个下标，行的增减
	}
}
