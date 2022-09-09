
public class MainMethod {
	public static void main(String[] args) throws InterruptedException {
		Example ex = new Example();
		ex.start();
		ex.join();
		Example ex1 = new Example();
		ex1.start();
	}
}
