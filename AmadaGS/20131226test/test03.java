package Day03;

import java.util.Scanner;

public class test03 {

	/**
	 * @param args����������ķ�����ʵ�δ��ݸ��β�
	 */
	static String name;
	static char sex;
	static int age;
	static double hight;
	static String type;
	
	
	static void Input(){
		Scanner scanner=new Scanner(System.in);
		System.out.println("������");
		name=scanner.next();
		System.out.println("�Ա�");
		sex=scanner.next().charAt(0);
		System.out.println("���䣺");
		age=scanner.nextInt();
		System.out.println("��ߣ�");
		hight=scanner.nextDouble();
		System.out.println("�Ը�");
		type=scanner.next();
		
	}
	
	 static void say(){
		 System.out.println("����"+name+" �Ա�"+sex+" ���䣺"+age+" ��ߣ�"+hight+" �Ը�"+type);
	 }
	  
	 static void feeling(String cause,String content){
		 System.out.println(cause);
		 System.out.println(content);
	 }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Input();
		say();
		feeling("������һ����","����˯������");
		Input();
		say();
		feeling("����һ���ֻ�","��������");
	
	}
  //   ����   ��   ��ɧ         ���   ��     ����
}
