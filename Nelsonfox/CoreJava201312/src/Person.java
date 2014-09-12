public class Person {
	// 对象的成员变量
	public String name;
	public char sex;
	public int age;
	public double height;
	public String type;

	// 说话，打招呼
	public void say() {
		System.out.println("嗨，大家好，俺叫" + name + "今年" + age + "岁，身高" + height
				+ "米，俺是一个" + type + sex + "士");
	}

	public void feeling(String cause, String content) {
		System.out.println(cause);
		System.out.println(content);
	}

	public Person() {
	name="张三";
	sex='男';
	age=18;
	height=1.7;
	type="活泼的";
	
	}
	public Person(String name){
		this();
		this.name=name;
	}
	public Person(String name,char sex){
		this(name);
		this.sex=sex;
	}
	public Person(String name,char sex,int age){
		this(name, sex);
		this.age=age;
	}
	public Person(String name,char sex,int age,double height){
		this(name, sex, age);
		this.height=height;
	}
	public Person(String name,char sex,int age,double height,String type){
		this(name, sex, age, height);
		this.type=type;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// JVM gc
//		Person p1 = new Person();
//		p1.name = "李伟";
//		p1.sex = 22;
//		p1.height = 1.8;
//		p1.type = "豪放的";
//		p1.say();
//		p1.feeling("俺找到好工作了，月薪8k", "哈哈.....");
//		p1.feeling("俺失恋了", "哇哇...");
//
//		p1.name = "韩伟";
//		p1.sex = 22;
//		p1.height = 1.9;
//		p1.type = "温柔的";
//		p1.say();
//		p1.feeling("俺找找好工作了，月薪10k", "哈哈.....");
Person person=new Person("韩伟", '男', 18, 1.9, "善良的");
person.say();
	}

}
