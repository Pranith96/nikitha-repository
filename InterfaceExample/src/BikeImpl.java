
public class BikeImpl implements Bike, Bike1 {

	public void tire() {
		System.out.println("tire");
	}

	@Override
	public void engine() {
		System.out.println("engine");
	}

	@Override
	public void breakss() {
		System.out.println("breaks");
	}

	@Override
	public void seat() {
		System.out.println("seats");
	}
}
