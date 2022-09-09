
public class ConditionalStatementExample {

	public static void main(String[] args) {

		int age = 18;

		if (age < 19) {
			System.out.println("age is less than 19");
		}
		System.out.println(age);

		if (age < 19) {
			System.out.println("age is less than 19");
		} else {
			System.out.println(age);
		}

		if (age < 19) {
			System.out.println("age is less than 19");
		} else if (age < 25 && age > 19) {
			System.out.println("age is less than 25 greater than 19");
		} else {
			System.out.println(age);
		}
	}
}
