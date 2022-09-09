import java.util.Arrays;

public class Example1 {

	public static void main(String[] args) {
		int a[] = { 1, 2, 6, 9, 7, 4, 5, 3, 8, 10 };
		System.out.println(Arrays.toString(a));
		System.out.println(a[9]);

		int b[] = new int[3];
		b[0] = 1;
		b[1] = 2;
		b[2] = 3;
		System.out.println(Arrays.toString(b));

		int c[][] = new int[2][2];
		c[0][0] = 1;
		c[0][1] = 2;
		c[1][0] = 3;
		c[1][1] = 4;

	}
}
