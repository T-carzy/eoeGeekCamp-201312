import java.util.Arrays;
import java.util.Random;

public class Test02 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int a[] = new int[5];

		Random random = new Random();
		for (int j = 0; j < a.length; j++) {
			a[j] = random.nextInt(5);
		}
		for (int i = 0; i < a.length - 1; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] < a[j]) {
					int c = a[0];
					a[0] = a[j];
					a[j] = c;

				}
				System.out.println(Arrays.toString(a));
			}

		}
	}

}
