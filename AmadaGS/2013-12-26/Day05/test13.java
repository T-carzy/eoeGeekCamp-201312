package Day05;

import java.util.Scanner;

public class test13 {

	/**
	 * @param args  �����ж������ϰ�·ݶ�Ӧ������
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		int n;
		do{
			System.out.println("������һ���·ݣ�");
			n=scanner.nextInt();
		}while(n<1 || n>12);
		 String[] days={"31��","28��","31��","30��",
				 "31��","30��","31��","31��",
				 "30��","31��","30��","31��",};
		 System.out.println(days[n-1]);
	}
}
