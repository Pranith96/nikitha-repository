
public class Thread1 extends Thread {
	Example ex;

	public Thread1(Example ex) {
		this.ex = ex;
	}

	public void run() {
		ex.print(5);
	}

}
