
package com.eoe.pre.oop.day01;

public class Student {

	/**
	 * @param args
	 */
//	public static void main(String[] args) {
//		String name="梁文峰";
//		char sex='男';
//		int age=25;
//		double height=1.7;
//		String type="豪放的";
//		String inSchool="eoe极客学院";
//		String inClass="Android1205班";
//		System.out.println("嗨，大家好，俺叫"+name+",今年"
//			+age+"岁,身高"+height+"米,俺是一个"
//			+type+sex+"士");
//		System.out.println("俺在"+inSchool+inClass+"学习");
//		System.out.println("俺给大家表演两个变量相交换的算法");
//		int a=10,b=100;
//		System.out.println("a="+a+"  b="+b);
//		a+=b;
//		b=a-b;
//		a-=b;
//		System.out.println("变");
//		System.out.println("a="+a+"  b="+b);
//		System.out.println("俺找到好工作啦!,月新8k"+"嘻嘻...");
//		//第二个学员
//		name="高珊";
//		sex='女';
//		age=22;
//		height=1.69;
//		type="活泼的";
//		inSchool="eoe极客学院";
//		inClass="Android1205班";
//		System.out.println("嗨，大家好，俺叫"+name+",今年"
//			+age+"岁,身高"+height+"米,俺是一个"
//			+type+sex+"士");
//		System.out.println("俺在"+inSchool+inClass+"学习");
//		System.out.println("俺给大家表演两个变量相交换的算法");
//		a=100;
//		b=1000;
//		System.out.println("a="+a+"  b="+b);
//		a+=b;
//		b=a-b;
//		a-=b;
//		System.out.println("变");
//		System.out.println("a="+a+"  b="+b);
//		System.out.println("俺找到好工作啦!,月新8k"+"嘻嘻...");
//
//		
	String name;
	double height;
	int age;
	String type;
	char sex;
	String inSchool;
	String inClass;
		public Student(){
		
			
		}
		public Student(String name,double height
				,int age,String type,char sex,String inSchool
				,String inClass){
			this.name=name;
			this.height=height;
			this.age=age;
			this.type=type;
			this.sex=sex;
			this.inSchool=inSchool;
			this.inClass=inClass;
	}
		public void say(){
			System.out.println("嗨，大家好，俺叫"+name+",今年"
					+age+"岁,身高"+height+"米,俺是一个"
					+type+sex+"士，我在"+inSchool+inClass+"上课");
		}
		public void feeling(String s1,String s2){
			System.out.println(s1);
			System.out.println(s2);
		}
		public void suanShu(int[]a,int i,int j ){
			a[i]+=a[j];
			a[j]=a[i]-a[j];
			a[i]-=a[j];
			
		}

}
