
public class MainMethod {

	public static void main(String[] args) {

		// initialization
		// condition
		// increment or decrement

		for (int i = 0; i < 10; i++) {
			if (i % 2 != 0) {
				System.out.println(i);
			}
		}

		int j = 0;

		while (j < 10) {
			System.out.println(j);
			j++;
		}

		do {
			System.out.println(j);
			j++;
		} while (j < 10);
	}
}
