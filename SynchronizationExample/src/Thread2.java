
public class Thread2 extends Thread {
	Example ex;

	public Thread2(Example ex) {
		this.ex = ex;
	}

	public void run() {
		ex.print(10);
	}

}
