package se2.day01;

public class Test04 {
public static void main(String[] args) {
	PersonThread zhangFei=new PersonThread("�ŷ�");
	PersonThread wangFei=new PersonThread("����");
	PersonThread liuYiFei=new PersonThread("�����");
	
	
	
	
	
	
	
	zhangFei.setPriority(Thread.MAX_PRIORITY);
	liuYiFei.setPriority(Thread.MIN_PRIORITY);
	wangFei.setPriority(6);
	zhangFei.start();
	wangFei.start();
	liuYiFei.start();
}
static class PersonThread extends Thread{
	public PersonThread(String name) {
		super.setName(name);
	}
	@Override
	public void run() {
		for(int i=1;i<=10;i++){
			System.out.println(getName()+":"+i);
			Thread.yield();
		}
	}
}
}
