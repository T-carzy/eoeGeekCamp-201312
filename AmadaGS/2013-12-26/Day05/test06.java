package Day05;

import java.util.Random;

public class test06 {

	/**
	 * @param args�������10�������ҳ������
	 */
	public static void main(String[] args) {
		Random random=new Random();
		int[] score=new int[10];
		for(int i=0;i<score.length;i++){
			score[i]=random.nextInt();
			System.out.println(score[i]);
		}
		for(int i=1;i<score.length;i++){
			if(score[0]<score[i]){
			    int t=score[0];
				score[0]=score[i];
				score[i]=t;
			}
			}
		System.out.println("max="+score[0]);
		}

	}

