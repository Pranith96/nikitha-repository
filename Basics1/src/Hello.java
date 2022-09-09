
public class Hello {

	public static void main(String args[]) {
		int i = 10;
		System.out.println(i);
		System.out.println("Hello");
		Hello hlw = new Hello();
		hlw.add();
		print();
		Display d = new Display();
		d.hi();
		System.out.println(d.j);
		Display.display();
		System.out.println(Display.k);
	}

	public void add() {
		print();
		System.out.println("add");
	}

	public static void print() {
		System.out.println("print");
	}
}
