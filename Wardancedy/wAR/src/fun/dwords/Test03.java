package fun.dwords;

public class Test03 {
	public String name;
	public char sex;
	public int age;
	public double height;
	public String type;
	public String inSchool;
	public static String inClass;
	private double heigt;

	public void say() {
		System.out.println("大家好，我叫" + name + "我是一个" + sex + "孩，今年" + age
				+ "岁，身高" + height + "我是一个" + type + "人，我在" + (String) inSchool
				+ "的" + (String) inClass);
	}

	public void feeling(String cause, String content) {
		System.out.println(cause);
		System.out.println(content);

	}

	public Test03() {
		name = "多多";
		sex = '男';
		age = 21;
		height = 1.71;
		type = "开朗的";
		inSchool = "EOE极客学院";
		inClass = "Andriond1205班";
	}

	public Test03(String name, char sex, int age, double heiht) {
		this();
		this.name = name;
	}

	public static void main(String[] args) {
		Test03 P1 = new Test03();
		{
			P1.name = "多多";
			P1.sex = '男';
			P1.age = 21;
			P1.height = 1.70;
			P1.type = "开朗的";
			P1.inSchool = "EOE极客学院";
			P1.inClass = "Andriond1205班";
			P1.say();
			P1.feeling("我结婚了", "哈哈....");
			P1.feeling("我离婚了", "呜呜..........");

			P1 = new Test03();
			P1.name = "韩伟";
			P1.sex = '男';
			P1.age = 21;
			P1.height = 1.72;
			P1.type = "闷骚的";
			P1.inSchool = "EOE极客学院";
			P1.inClass = "Andriond1205班";
			P1.say();
			P1.feeling("我离婚了", "呜呜....");
			P1.feeling("我结婚了", "哈哈..........");

		}
	}
	// /**
	// * @param args
	// */
	// public static void main(String[] args) {
	// String name="梁文峰";
	// char sex='男';
	// int age=25;
	// double height=1.7;
	// String type="豪放的";
	// String inSchool="eoe极客学院";
	// String inClass="Android1205班";
	// System.out.println("嗨，大家好，俺叫"+name+",今年"
	// +age+"岁,身高"+height+"米,俺是一个"
	// +type+sex+"士");
	// System.out.println("俺在"+inSchool+inClass+"学习");
	// System.out.println("俺给大家表演两个变量相交换的算法");
	// int a=10,b=100;
	// System.out.println("a="+a+"  b="+b);
	// a+=b;
	// b=a-b;
	// a-=b;
	// System.out.println("变");
	// System.out.println("a="+a+"  b="+b);
	// System.out.println("俺找到好工作啦!,月新8k"+"嘻嘻...");
	// //第二个学员
	// name="高珊";
	// sex='女';
	// age=22;
	// height=1.69;
	// type="活泼的";
	// inSchool="eoe极客学院";
	// inClass="Android1205班";
	// System.out.println("嗨，大家好，俺叫"+name+",今年"
	// +age+"岁,身高"+height+"米,俺是一个"
	// +type+sex+"士");
	// System.out.println("俺在"+inSchool+inClass+"学习");
	// System.out.println("俺给大家表演两个变量相交换的算法");
	// a=100;
	// b=1000;
	// System.out.println("a="+a+"  b="+b);
	// a+=b;
	// b=a-b;
	// a-=b;
	// System.out.println("变");
	// System.out.println("a="+a+"  b="+b);
	// System.out.println("俺找到好工作啦!,月新8k"+"嘻嘻...");

	public Test03(String name, char sex, int age, double height, String type,
			String inSchool, double heigt) {
		super();
		this.name = name;
		this.sex = sex;
		this.age = age;
		this.height = height;
		this.type = type;
		this.inSchool = inSchool;
		this.heigt = heigt;
	}
}
