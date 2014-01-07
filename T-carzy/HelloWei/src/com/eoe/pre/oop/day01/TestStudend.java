package com.eoe.pre.oop.day01;

public class TestStudend {


	public static void main(String[] args) {
			Student s=new Student("黄飞鸿",19.0,22,"暴躁的",'男',
					"eoe极客工作坊","安卓1205班");
			s.say();
			s.feeling("女朋友跟人跑了", "哈哈哈");
			System.out.println("下面给大家演示算法；");
			int []aa={222,333};
			System.out.println("a="+aa[0]+"b="+aa[1]);
			s.suanShu(aa, 1, 0);
			System.out.println("a="+aa[0]+"b="+aa[1]);
			Student ss=new Student("霍元甲",11.0,29,"狂野的",'男',
					"eoe极客工作坊","安卓1205班");
			ss.say();
			ss.feeling("我又被打败了", "哈哈哈。。。");
			System.out.println("下面给大家演示算法；");
			int []bb={222333,333222};
			System.out.println("a="+bb[0]+"b="+bb[1]);
			s.suanShu(bb, 1, 0);
			System.out.println("a="+bb[0]+"b="+bb[1]);
	}

}
