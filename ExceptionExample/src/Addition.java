import java.util.Arrays;

public class Addition {

	public static void main(String[] args) {
		try {
			int a = 10;
			int b = a / 2;
			System.out.println(b);
			int[] x = new int[3];
			x[0] = 1;
			x[1] = 2;
			x[2] = 3;
			x[3] = 4;
			System.out.println(Arrays.toString(x));
		} catch (ArithmeticException ex) {
			ex.printStackTrace();
		} catch (ArrayIndexOutOfBoundsException ex) {
			ex.printStackTrace();
			System.out.println(ex.getLocalizedMessage());
			System.out.println(ex.getMessage());
		} catch (Exception ex) {
			ex.printStackTrace();
		} finally {
			System.out.println("java");
		}
		System.out.println("hi hello");
	}
}
