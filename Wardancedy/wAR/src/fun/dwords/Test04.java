package fun.dwords;
public class Test04 {
public String name;
public char sex;
public int age;
public double height;
public String type;
public String inSchool;
public String inClass;
private void say() {
	System.out.println("大家好，我叫" + name + "我是一个" + sex + "孩，今年" + age
			+ "岁，身高" + height + "我是一个" + type + "人，我在" + (String) inSchool
			+ "的" + (String) inClass);
}

}
