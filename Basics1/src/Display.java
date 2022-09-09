
public class Display {

	int j = 5; // instance variable
	static int k = 10;

	public void hi() {
		int i = 10; // local variable
		System.out.println(i);
		System.out.println(j);
		System.out.println("hi");
		System.out.println(k);

	}

	public static void display() {
		System.out.println("display");
		System.out.println(k);

	}
}
