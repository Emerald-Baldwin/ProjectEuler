
public class Problem1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		long sum = 0;
		for (int i = 0; i < 1000; i++) {
			if (i % 3 == 0) {
				sum += i;
			} else if (i % 5 == 0) {
				sum += i;
			}
		}
		
		System.out.println(sum);

	}

}
