package se2.day01;

public class Test13 {
	static int money=1000;
public static void main(String[] args) {
	User user1=new User("�ŷ�");
	User user2=new User("����");
	User user3=new User("�����");
	user1.start();
	user2.start();
	user3.start();
}
static class User extends Thread{
	public User(String name) {
		this.setName(name);
	}
	@Override
	public void run() {
		getMoney(this.getName());
	}
}
private static synchronized void getMoney(String name){
	if(money>=400){
		System.out.println(name+"ȡ��400Ԫ");
		money-=400;
		System.out.println("ʣ��"+money+"Ԫ");
	}else{
		System.out.println("����400Ԫ");
	}
}
}
