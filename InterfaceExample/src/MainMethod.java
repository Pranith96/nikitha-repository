
public class MainMethod {

	public static void main(String[] args) {
		Bike b = new BikeImpl(); // runtime polymorphism
		b.breakss();
		b.tire();
		b.seat();
		b.engine();
		
		BikeImpl2 b1 = new BikeImpl2();
		b1.breakss();
		b1.tire();
		b1.seat();
		b1.engine();
		
		
	}
}
