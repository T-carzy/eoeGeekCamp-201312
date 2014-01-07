import java.util.Arrays;

import org.omg.CORBA.PUBLIC_MEMBER;

public class Student0107 {
	public String name;
	public int age;
	public double height;
	public char sex;
	public String type;
	public String inSchool;
	public String inClass;

	public Student0107() {
		name = "韩伟";
		age = 18;
		height = 1.9;
		sex = '男';
		type = "活泼的";
		inSchool = "eoe计科学院";
		inClass = "android1205班";
	}

	public Student0107(String name) {
		this();
		this.name = name;
	}

	public Student0107(String name, int age) {
		this(name);
		this.age = age;

	}

	public Student0107(String name, int age, double height) {
		this(name, age);
		this.height = height;
	}

	public Student0107(String name, int age, double height, char sex) {

		this(name, age, height);
		this.sex = sex;
	}

	public Student0107(String name, int age, double height, char sex,
			String type) {
		this(name, age, height, sex);
		this.type = type;
	}

	public Student0107(String name, int age, double height, char sex,
			String type, String inSchool) {
		this(name, age, height, sex, type);
		this.inSchool = inSchool;
	}

	public Student0107(String name, int age, double height, char sex,
			String type, String inSchool, String inClass) {
		this(name, age, height, sex, type, inSchool);
		this.inSchool = inClass;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Student0107 student1 = new Student0107();
		// student1.name = "韩伟";
		// student1.age = 22;
		// student1.height = 1.9;
		// student1.sex = '男';
		// student1.type = "活泼的";
		// student1.inSchool = "eoe计科学院";
		// student1.inClass = "andriod1205班";

		//
		// student1.say();
		Student0107 student0107 = new Student0107("韩伟", 18, 1.89, '男', "活泼的",
				"eoe即可学院", "1205班");
		student0107.say();
		int a[] = { 100, 10 };
		System.out.println(Arrays.toString(a));
		System.out.println("变");
		student0107.exchange(a, 0, 1);
		System.out.println(Arrays.toString(a));

		Student0107 s2 = new Student0107();
		s2.name = "梁文峰";
		s2.age = 22;
		s2.height = 1.9;
		s2.sex = '男';
		s2.type = "暴躁的";
		s2.inSchool = "eoe计科学院";
		s2.inClass = "andriod1205班";
		s2.say();

		System.out.println(Arrays.toString(a));
		System.out.println("变");
		s2.exchange(a, 0, 1);
		System.out.println(Arrays.toString(a));

	}

	public void say() {
		System.out.println("嗨，大家好，我叫" + name + "今年" + age + "岁，是一个" + type
				+ sex + "士");
		System.out.println("我在" + inSchool + "学校" + inClass + "班学习Andriod");

	}

	public void exchange(int[] a, int i, int j) {
		a[i] += a[j];
		a[j] = a[i] - a[j];
		a[i] -= a[j];
	}
}
