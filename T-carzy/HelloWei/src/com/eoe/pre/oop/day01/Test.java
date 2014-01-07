package com.eoe.pre.oop.day01;

import java.util.Arrays;

public class Test {

	
	public static void main(String[] args) {
			Student s=new Student("梁文峰",2.22,22,"狂暴的",'女',"极客工作坊","安卓1205班");
			s.say();
			s.feeling("我失恋了", "哈哈哈哈。。。");
			int[] aa={5,10};
			System.out.println(Arrays.toString(aa));
			s.suanShu(aa, 0, 1);
			System.out.println(Arrays.toString(aa));
			Student s3=new Student();
			s3.name="梁文峰峰";
			s3.age=11;
			s3.type="狂野的";
			s3.sex='男';
			s3.height=1.11;
			s3.inSchool="极客工作坊";
			s3.inClass="安卓1205..";
			s3.say();
			s3.feeling("我也失恋了","好爽啊");
			int[] bb={1111111111,999999999};
			System.out.println(Arrays.toString(bb));
			s3.suanShu(bb, 0, 1);
			System.out.println(Arrays.toString(bb));
	}

}
