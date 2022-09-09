
public class MainMethod {

	public static void main(String[] args) {

		MainMethod mm = new MainMethod();
		int result = mm.data();
		System.out.println(result);
		int x = 5;
		int y = 5;
		int result1 = mm.add(x, y);
		System.out.println(result1);
		String result2 = welcome("XYZ");
		System.out.println(result2);

		String result3 = mm.sum(10, 20, "100");
		System.out.println(result3);
	}

	public int data() {
		int i = 10;
		int j = 10;
		int k = i + j;
		return k;
	}

	public int add(int a, int b) {
		int c = a * b;
		return c;
	}

	public static String welcome(String message) {
		String data = "Hi hello welcome " + message;
		return data;
	}

	public String sum(int a, int b, String message) {
		int c = a + b;
		String data = message + c; // 10030
		return data;
	}
}
