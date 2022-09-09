
public class MainMethod2 {
	public static void main(String[] args) throws InterruptedException {
		Example2 ex = new Example2();
		Thread th = new Thread(ex);
		th.start();
	}
}
