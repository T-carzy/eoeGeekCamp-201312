package com.eoe.se2.day01;
/*
 * ��ʾ��-10���̵߳��첽�������������ݲ�������ʾ����
(1)	����ĳ�˺���1000Ԫ��
(2)	����User�߳��࣬�����ʾһ���û�ÿ��ȡ��400Ԫ��
(3)	��main()�д��������̶߳��󣬲������������̶߳���ִ��ȡǮ�Ĳ������������ڵ���400ʱ����ȡ�������ȡ��

 */
public class Test16 {
	static Integer money=1000;
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
			synchronized (money) {
				if(money>=400){
					System.out.println(this.getName()+"ȡ��400Ԫ");
					money-=400;
					System.out.println("ʣ��"+money+"Ԫ");
					
				}else{
					System.out.println("����400Ԫ");
				}
			}
		}
	}
	
}
