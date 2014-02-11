package com.eoe.pre.day03.entity;

import com.eoe.pre.day03.Person;

public class Student extends Person {
	String inSchool;
	String inClass;
	public Student(){
		
	}
	//alt+sift+s
	/**
	 * @param name:����
	 * @param sex
	 * @param age
	 * @param height
	 * @param type
	 * @param inSchool
	 * @param inClass
	 */
	public Student(String name, char sex, int age,
			double height, String type,
			String inSchool, String inClass) {
		//Person��Ĵ�5�������Ĺ�����
		super(name, sex, age, height, type);
		this.inSchool = inSchool;
		this.inClass = inClass;
	}
	@Override 
	//��д�����д
	public void say() {
		// TODO Auto-generated method stub
		super.say();
		System.out.println("����"+inSchool+inClass+"ѧϰ");
	}

	// ����n��
	public double fact(int n) {
		double result = 1;
		for (int i = 1; i <= n; i++) {
			result *= i;
		}
		return result;
	}
	public static void main(String[] args) {
		Student s = new Student("��С��",'��',
			23,1.89,"��ŵ�","eoe���͹�����","eoe20131205��");
		s.say();
		s.feeling("��ʧ����", "����...");
		System.out.println("����������ʾ����5��");
		System.out.println("5!="+s.fact(5));
	}
}
