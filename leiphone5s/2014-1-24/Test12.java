package se2.day04;

public class Test12 {
	public static void main(String[] args) {

		for (int i = 4; i >= -4; i--)// ��������
		{
			for (int j = 0; j < Math.abs(i) + 3; j++)
				System.out.print(" ");// ����ÿ�еĵĿո���,�����5��ǰ�治Ҫ�ո�,���԰�+3ȥ��
			for (int j = 0; j < (5 - Math.abs(i)); j++)
				System.out.print("* ");// ����ÿ��*�ĸ���

			System.out.println();// ����
		}
	}

}
