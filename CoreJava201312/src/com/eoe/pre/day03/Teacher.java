package com.eoe.pre.day03;

public class Teacher {
	public String name;
	public char sex;
	public int age;
	public double height;
	public String type;
	public String inSchool;
	public String worker;//ְ��

	// ctrl+f6:�����л�����һ����
	public Teacher(String name, char sex, int age, double height, String type,
			String inSchool, String worker) {
		this.name = name;
		this.sex = sex;
		this.age = age;
		this.height = height;
		this.type = type;
		this.inSchool = inSchool;
		this.worker=worker;
	}
	public Teacher(){
		
	}

	// ˵��
	public void say() {
		System.out.println("�ˣ���Һã�����" + name + ",����" + age + "��,���" + height
				+ "��,����һ��" + type + sex + "ʿ");
		System.out.println("����" + inSchool + "��"+worker);
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
		Teacher teacher = new Teacher("�Ŵ��",'��',
			33,1.89,"��ŵ�","eoe���͹�����","��ʦ");
		teacher.say();
		teacher.feeling("����ѧ���ҵ��ù�����","��н8k");
	}

}
