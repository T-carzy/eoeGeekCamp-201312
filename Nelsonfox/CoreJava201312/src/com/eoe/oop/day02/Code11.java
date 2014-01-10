package com.eoe.oop.day02;

public class Code11 {

	public Code11() {
		// TODO Auto-generated constructor stub
	}

	/**Object类常用方法实例
	 * equals()
	 * toString()
	 * @param args
	 */
	public static void main(String[] args) {
Object o1=new Object();
Object o2=new Object();
//判断两个对象的地址是否相等
if(o1.equals(o2)){
	System.out.println("是同一对象");
}else{
	System.out.println("不是同一对象");
}
//打印o1实际调用的是o1.toString()
System.out.println("o1的值"+o1);
//打印o2世纪调用的是o2.toString()
System.out.println("o2的值"+o2);
o1=o2;//地址赋值
//判断两个引用变量是否相等
if(o1.equals(o2)){
	System.out.println("是同一对象");
}else {
		System.out.println("不是同一对象");
	}
//打印两个变量引用的地址
System.out.println("o1的值"+o1.toString());
System.out.println("o2的值"+o2.toString());
}
	

}
