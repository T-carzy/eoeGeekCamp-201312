package com.eoe.basic.day04;

import java.util.Random;

public class Test24 {

	/**
	 * �������10��������Ҫ������ķ�����[60,100]֮�䣩��
	 * �ҳ���߷֡� 
	 */
	public static void main(String[] args) {
		Random random=new Random();
		int max=Integer.MAX_VALUE;//int���͵���Сֵ
		for(int i=1;i<=10;i++){
			int score=random.nextInt(41)+60;
			System.out.print(score+"  ");
			if(max>score){
				max=score;
			}
		}
		System.out.println();
		System.out.println("��߷�:"+max);
	}

}
