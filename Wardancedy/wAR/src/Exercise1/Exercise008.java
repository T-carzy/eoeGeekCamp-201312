package Exercise1;
import java.util.Scanner;

public class Exercise008 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// x=��λ=a/100;
		// y=ʮλ=a%100/10;
		// z=��λ=((a%100)%10);
		// system.out.print(z*100+y*10+x);
		Scanner input = new Scanner(System.in);
		System.out.println("������һ����λ��");
		
		int a=input.nextInt();
		int num4=a%10;//��λ
		int num3=a%100/10;//ʮλ
		int num2=a%1000/100;//��λ
		int num1=a/1000;//ǧλ
		int num=num4*1000+num3*100+num2*10+num1;
		System.out.println("�������������Ϊ"+ num);

	}

}
