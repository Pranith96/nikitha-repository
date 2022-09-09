
public class MainMethod {

	public static void main(String[] args) {

		// unary example

		int a = 10;
		System.out.println(a++); // 10 ==> 11 // postfix
		System.out.println(a); // 11
		System.out.println(++a);// prefix ==> 12
		System.out.println(a);// 12
		System.out.println(a--); // 12 ==> 11
		System.out.println(--a); // 10

		int b = 10;
		int c = 10;
		System.out.println(b++ + ++b); // 10+1+1+10 =22
		System.out.println(c++ + c++); // 10+1+10 == 21
		System.out.println(c); //12
	}
}
