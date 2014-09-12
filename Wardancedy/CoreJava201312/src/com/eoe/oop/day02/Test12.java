package com.eoe.oop.day02;

public class Test12 {
	/**
	 * ���ʾ��
	 */
	public static void main(String[] args) {
		//����Բ���󣬲�����Բ�İ뾶
		Circle_ c=new Circle_(8);
		//���㲢��ʾԲ��������ܳ�
		System.out.println("area="+c.area(c.r));
		System.out.println("girth="+c.girth(c.r));
		//����Բ�Ķ���
		c.center=new Point_(5,10);
	}
}
//���������Ļ��һ�������
class Point_{
	int x;
	int y;
	public Point_(int x, int y) {
		this.x = x;
		this.y = y;
	}
}
//�������Բ����
class Circle_ {
	Point_ center;//��Ա����center����Բ��
	double r;//Բ�İ뾶
	//��һ�������Ĺ��췽��
	public Circle_(double r) {
		this.r = r;
	}
	//�����������Ĺ��췽��
	public Circle_(Point_ center, double r) {
		this.center = center;
		this.r = r;
	}
	//����Բ����� 
	public double area(double r){
		return Math.PI*r*r;				
	}
	//����Բ���ܳ�
	public double girth(double r){
		return Math.PI*2*r;
	}
}
