package com.eoe.pre.day03.entity;

public class Teacher_ extends Person_{
	String inSchool;
	String worker;
	
	/**
	 * @param name
	 * @param sex
	 * @param age
	 * @param height
	 * @param type
	 * @param inSchool
	 * @param worker
	 */
	public Teacher_(String name, char sex, int age, double height, String type,
			String inSchool, String worker) {
		super(name, sex, age, height, type);
		this.inSchool = inSchool;
		this.worker = worker;
	}
	@Override
	public void say() {
		// TODO Auto-generated method stub
		super.say();
		System.out.println("����"+inSchool+"��"+worker);
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Teacher_ t=new Teacher_("�Ŵ��", '��', 35, 1.89, "���ص�", "eoe���ɹ�����", "��ʦ");
		t.say();
		
	}
	@Override
	public void doing() {
		System.out.println(this.getName()+"����д�̰�....");
	}

}
