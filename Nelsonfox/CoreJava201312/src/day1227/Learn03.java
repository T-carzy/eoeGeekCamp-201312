package day1227;

public class Learn03 {

	public Learn03() {
		// TODO Auto-generated constructor stub
	}

	/** * 打印9×9表
	 * 1*1= 1  1*2= 2  1*3= 3  1*4= 4  1*5= 5  1*6= 6  1*7= 7  1*8= 8  1*9= 9  
	   2*2= 4  2*3= 6  2*4= 8  2*5=10  2*6=12  2*7=14  2*8=16  2*9=18  
	   3*3= 9  3*4=12  3*5=15  3*6=18  3*7=21  3*8=24  3*9=27  
	   4*4=16  4*5=20  4*6=24  4*7=28  4*8=32  4*9=36  
	   5*5=25  5*6=30  5*7=35  5*8=40  5*9=45  
	   6*6=36  6*7=42  6*8=48  6*9=54  
	   7*7=49  7*8=56  7*9=63  
	   8*8=64  8*9=72  
	   9*9=81
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
for(int i=1;i<=9;i++){
	for(int j=i;j<=9;j++){
		if(i*j<10){
			System.out.print(+i+"*"+j+"=  "+i*j+" ");
		}else{
			System.out.print(+i+"*"+j+"="+i*j+" ");
		}
	}
	System.out.println();
}
	}

}
