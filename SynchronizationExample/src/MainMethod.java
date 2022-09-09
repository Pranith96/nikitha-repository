
public class MainMethod {

	public static void main(String[] args) {
		Example ex = new Example();
		Thread1 th = new Thread1(ex);
		th.start();

		Thread2 th2 = new Thread2(ex);
		th2.start();
	}
}
