package Day03;

import java.util.Scanner;

public class test02 {

	/**
	 * @param args��ϰ���巽�������������е��ø÷���
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
	
	
	//    ��    Ů      ����
	//    ������   ��    ����
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Input();
       System.out.println("��Һã��ҽ�"+name+"�Ա�"+sex+"����"+age+"���"+hight+"�Ը�"+type);
       System.out.println("�ҿ�����100�֣�żҲ��");
       System.out.println("�Ҷ���һ���ֻ������ء���");
       
       Input();
       System.out.println("��Һã�����"+name+"�Ա�"+sex+"����"+age+"���"+hight+"�Ը�"+type);
       System.out.println("���ǶӴ�������˵�һ��");
       System.out.println("�ҳɼ��н�����");
	}

}
