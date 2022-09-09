
public class Example {

	public static synchronized void print(int num) {

		for (int i = 1; i <= 10; i++) {
			System.out.println(i * num);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}
}
