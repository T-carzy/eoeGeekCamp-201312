package Exercise;

public class Exercise06 {

	/**��дExercise06�࣬����3712���Ǽ�Сʱ�����֡����롣
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int seconds=3712;
		int hours=seconds/3600;
		seconds=seconds%3600;
		int minutes=seconds/60;
		seconds=seconds%60;
		int second=seconds;
		System.out.println("ʱ���ǣ�"+hours+"Сʱ"+minutes+"����"+second+"��");
	}

}
