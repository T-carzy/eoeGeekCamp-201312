package Day05;

import java.util.Random;

public class test05 {

	/**
	 * @param args//�������10��60-100֮�������
	 * ��ʾ���г���ƽ����������±�
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] score=new int[10];
		Random random=new Random();
		double total=0;
		for(int i=0;i<score.length;i++){
			score[i]=random.nextInt(41)+60;
			total+=score[i];
			System.out.println(score[i]+" total="+total);
		}
		double avg=total/score.length;
		System.out.println("ƽ������"+avg);
		for(int i=0;i<score.length;i++){
			if(score[i]>avg)
			{   System.out.println(score[i]+":"+i);
		}
	}
  }
}
