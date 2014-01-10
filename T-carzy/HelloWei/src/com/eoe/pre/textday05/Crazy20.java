package com.eoe.pre.textday05;
import java.util.Random;
/**
 * 随机产生10个60～100之间的分数，找出最高分。
 */
public class Crazy20 {


	public static void main(String[] args) {
			Random random=new Random();
			int [] scores=new int [10];
			for(int i=0;i<scores.length;i++){
				scores[i]=random.nextInt(41)+60;
				System.out.println(scores[i]+" ");
			}
			for(int j=1;j<scores.length;j++){
				if(scores[0]<scores[j]){
					int k=scores[0];
					scores[0]=scores[j];
					scores[j]=k;
				}
			}
			
			System.out.println("最高分是："+scores[0]);
	}

}
