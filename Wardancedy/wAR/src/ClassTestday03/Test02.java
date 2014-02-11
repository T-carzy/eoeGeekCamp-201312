package ClassTestday03;

public class Test02 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a;
a=1;
try {
	a=5/0;
} catch (AbstractMethodError e) {
	// TODO: handle exception
	System.out.println(e.toString());
}catch(Exception e){
	}finally{
//f.close();
}
System.out.println("我能被执行到");
}
}