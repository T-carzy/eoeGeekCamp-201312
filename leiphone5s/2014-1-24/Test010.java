package se2.day04;

public class Test010 {
	/*
	 * int aaa=2;//�����������δ�С for(int i=-aaa;i<=aaa;i++) //����Y�� { for(int
	 * j=-aaa;j<=aaa;j++) //����X�� {
	 * System.out.print((Math.abs(i)+Math.abs(j)<=aaa)?"*":" ");//Ҫ�����<=�ó�== }
	 * System.out.println();//���� }
	 */
	public static void main(String[] args) {

		int aaa = 5; // ���õ�Ԫ����
		int bbb = 2;// ���ô�����
		for (int b = -bbb; b <= bbb; b++) {   
			for (int i = -aaa; i <= aaa; i++) // ����Y��
			{
				for (int a = -bbb; a <= bbb; a++) {
					for (int j = -aaa; j <= aaa; j++) // ����X��
					{
						System.out.print((Math.abs(i) + Math.abs(j) <= aaa && 
								Math.abs(a) + Math.abs(b) <= bbb) ? "*": " ");
					}
				}
				System.out.println();// ����
			}
		}
	}
}
