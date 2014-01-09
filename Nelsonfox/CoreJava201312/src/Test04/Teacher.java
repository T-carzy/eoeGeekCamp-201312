package Test04;

import java.util.Arrays;

import com.eoe.oop.day01.Person;
import com.eoe.oop.day01.Student;

public class Teacher extends Person {
	public String inSchool;
	public String inClass;

	// 重写，复写，覆盖
	@Override
	public void say() {
		// TODO Auto-generated method stub
		super.say();
		System.out.println("我在" + inSchool + inClass + "做讲师");
	}

	public Teacher() {
		// TODO Auto-generated constructor stub
	}

	public Teacher(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	public Teacher(String name, char sex) {
		super(name, sex);
		// TODO Auto-generated constructor stub
	}

	public Teacher(String name, char sex, int age, double height, String type,
			String inSchool, String inClass) {
		super(name, sex, age, height, type);
		this.inSchool = inSchool;
		this.inClass = inClass;
	}

	public void swap(int[] a, int i, int j) {
		int c = a[i];
		a[i] = a[j];
		a[j] = c;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Teacher t1 = new Teacher("韩伟", '男', 18, 1.8, "活泼的", "eoe极客学院", "1205班");
		t1.say();
		System.out.println(t1.name);
		t1.feeling("我失恋了", "呜呜...");
		System.out.println("我给大家讲个例子");
		int[] a = { 10, 100 };
		System.out.println(Arrays.toString(a));
		t1.swap(a, 0, 1);
		System.out.println("变");
		System.out.println(Arrays.toString(a));
	}

}
