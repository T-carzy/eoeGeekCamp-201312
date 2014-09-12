import java.util.Arrays;
import java.util.Random;


public class day0103 {

	public day0103() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Random random=new Random();
		int[] score=new int[10000];
        for(int i=0;i<score.length;i++){
        	score[i]=random.nextInt(201);
        }
        for(int i=0;i<score.length;i++){
        	for(int j=i+1;i<score.length;j++){
        		if(score[i]>score[j]){
        			int temp=score[i];
        			score[i]=score[j];
        			score[j]=temp;
        		}
        	}
        }
        System.out.println(Arrays.toString(score));
	}


}
