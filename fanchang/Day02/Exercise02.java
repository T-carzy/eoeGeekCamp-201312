package com.eoe.basic.day02;
import java.util.Scanner;


public class Exercise02 {

	/**��д���㻪��ת��Ϊ�����¶ȵĳ��򣬹�ʽ�� �����¶�ֵ=�������¶�ֵ-32����5��9
   Ҫ��
   	 (1)������ʩ�¶��ɼ������롣
     (2)����С�����1λ��
	 * @param args
	 */
	public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
			System.out.print("�����뻪���¶�ֵ��");
			double t =scanner.nextDouble();
			double s = (t-32)*5/9;
			System.out.println("�����¶�ֵ�ǣ�"+Math.round(s*10)/10d);

	}

}
