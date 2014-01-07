package com.eoe.pre.textday05;
import java.util.Random;
public class Crazy19 {

	/**
	 * 随机产生10个60～100之间的分数，显示所有超过平均分的分数和下标。
	 */
	public static void main(String[] args) {
			int [] scores=new int[10];
			Random random=new Random();
			int total=0;
			for(int i=0;i<scores.length;i++){
				scores[i]=random.nextInt(41)+60;
				total+=scores[i];
				System.out.println(scores[i]+" ");
			}
			System.out.println();
			double avg=total/10.0;
			System.out.println("平均分："+avg);
			for(int i=0;i<scores.length;i++){
				if(scores[i]>avg){
					System.out.println(scores[i]+":"+i);
				}
			}
	}

}
