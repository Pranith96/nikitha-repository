
public class BikeImpl2 implements Bike {

	public void tire() {
		System.out.println("tire1");
	}

	@Override
	public void engine() {
		System.out.println("engine1");
	}

	@Override
	public void breakss() {
		System.out.println("breaks1");
	}

	@Override
	public void seat() {
		System.out.println("seats1");
	}
}
