package com.eoe.Oop.exercise;

import java.util.Arrays;

public class Exercise01_2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Teacher t=new Teacher("王宝刚",'男',34,1.87,
				"体育学院","篮球");
		t.introduce();
		t.feeling("我们班运动员考试的了一等奖", "哈哈。。");
		System.out.println("我给你们表演变数");
		int[] a={23,45};
		System.out.println("a[0]="+a[0]+" a[1]="+a[1]);
		t.swap(a, 0, 1);
		System.out.println("变");
		System.out.println("a[0]="+a[0]+" a[1]="+a[1]);
		//2
		Teacher tea=new Teacher("刘佳",'女',32,1.58,"外语","英语");
		tea.introduce();
		tea.feeling("我中奖了", "我很开心！");
		System.out.println("这是第"+Teacher.count+"个人了！");
	}
}
