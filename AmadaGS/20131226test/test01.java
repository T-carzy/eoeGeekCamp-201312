package Day03;

import java.util.Scanner;

public class test01 {

	/**
	 * @param args��ϰ��static��������ľ�̬����
	 */ static String name;
       static  char sex;
       static  double hight;
       static  int age;
       static  String  type;
       
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner scanner=new Scanner(System.in);
     System.out.println("������");
      name=scanner.next();
     System.out.println("�Ա�");
      sex=scanner.next().charAt(0);
     System.out.println("��ߣ�");
      hight=scanner.nextDouble();
     System.out.println("����");
     age=scanner.nextInt();
     System.out.println("�Ը�");
     type=scanner.next();
     System.out.print("��Һã�����"+name+"�Ա�"+sex+"���"+hight+"����"+age+"�ҵ��Ը���"+type);
   //  ����     Ů  ����
    }    

}
