package com.eoe.pre.textday05;
import java.util.Arrays;
//60-100随机产生五个数字，找出最高数并将它放在第零个元素上
import java.util.Random;
public class Crazy01 {
	public static void main(String[] args){
		Random random=new Random();
		int[] scores=new int[5];
		for (int i=0;i<scores.length;i++){
			scores[i]=random.nextInt(41)+60;
		}
		System.out.println(Arrays.toString(scores));
		for(int i=1;i<scores.length;i++){
			if(scores[0]<scores[i]){
				int temp=scores[0];
				scores[0]=scores[i];
				scores[i]=temp;
			}
		}
		System.out.println(Arrays.toString(scores));
	}

}
