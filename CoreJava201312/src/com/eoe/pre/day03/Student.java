package com.eoe.pre.day03;

public class Student {
	public String name;
	public char sex;
	public int age;
	public double height;
	public String type;
	public String inSchool;
	public String inClass;

	// ctrl+f6:�����л�����һ����
	public Student(String name, char sex, int age, double height, String type,
			String inSchool, String inClass) {
		this.name = name;
		this.sex = sex;
		this.age = age;
		this.height = height;
		this.type = type;
		this.inSchool = inSchool;
		this.inClass = inClass;
	}
	public Student(){
		
	}

	// ˵��
	public void say() {
		System.out.println("�ˣ���Һã�����" + name + ",����" + age + "��,���" + height
				+ "��,����һ��" + type + sex + "ʿ");
		System.out.println("����" + inSchool + inClass + "ѧϰ");
	}

	// ������
	public void feeling(String cause, String content) {
		System.out.println(cause);
		System.out.println(content);
	}

	// ����n��
	public double fact(int n) {
		double result = 1;
		for (int i = 1; i <= n; i++) {
			result *= i;
		}
		return result;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Student student = new Student("��С��",'��',
			23,1.89,"��ŵ�","eoe���͹�����","eoe20131205��");
		student.say();
		student.feeling("���ҵ��ù�����","��н8k");
	}

}
