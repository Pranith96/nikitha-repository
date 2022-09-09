import java.util.ArrayList;
import java.util.List;

public class Example4 {

	public static void main(String[] args) {
		List<Student> list = new ArrayList<>();
		Student student1 = new Student();
		student1.setId(1);
		student1.setMobileNumber("1234567890");
		student1.setName("ABC");

		Student student2 = new Student(2, "PQR", "1234567098");
		list.add(student1);
		list.add(student2);
		list.add(new Student(3, "XYZ", "0987654321"));
		list.add(new Student(4, "XYZu", "09843654321"));
		list.add(new Student(5, "XYYZ", "0982354321"));

		System.out.println(new Student(6, "PYYZ", "0982354321"));
		System.out.println(list);
		System.out.println(list.get(0));
	}
}
