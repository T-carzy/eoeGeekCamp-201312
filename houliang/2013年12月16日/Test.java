import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ArrayList<String> name = new ArrayList<String>();
		name.add("��Ȫ");
		name.add("�ű���");
		name.add("��ΰ");
		name.add("���ķ�");
		name.add("����Ӣ");
		name.add("����");
		name.add("������");
		name.add("������");
		name.add("��ΰ");
		Random i=new Random();
		int j=name.size()-1;
		int x=1;
		while(name.size()>0){
			String n=null;
			if(j>0){	
				 n=name.remove(i.nextInt(j));
			}else if(j==0){
				 n=name.remove(0);
			}
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
//			Scanner scanner=new Scanner(System.in);
//			System.out.println("��ѡ��");
//			int k=scanner.nextInt();
//			System.out.println(k+"."+n);
			System.out.println(x+"."+n);
			if(j>0){
				j--;
			}
			x++;
			
		}
	}

}
