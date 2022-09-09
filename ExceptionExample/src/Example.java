
public class Example {

	public static void main(String[] args) {
		int age = 18;

		if (age < 19) {
			throw new DataNotFoundException2("Age is lessthan 19");
		}
		System.out.println("hi");
	}
}
