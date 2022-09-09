import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Example2 {

	public static void main(String[] args) {
		List<Student> list = new ArrayList<>();
		Student student1 = new Student();
		student1.setId(1);
		student1.setMobileNumber("1234567890");
		student1.setName("ABC");

		Student student2 = new Student(6, "PQR", "1234567098");
		Student student3 = new Student(2, "PQR1", "12345670998");
		Student student4 = new Student(1, "PQR2", "12345670908");
		Student student5 = new Student(7, "PQR3", "123456709908");

		list.add(student1);
		list.add(student2);
		list.add(new Student(3, "XYZ", "0987654321"));
		list.add(new Student(4, "XYZu", "09843654321"));
		list.add(new Student(5, "XYYZ", "0982354321"));

		Map<Student, Integer> map = new HashMap<>();
		map.put(student1, 1);
		map.put(student2, 4);
		map.put(student3, 2);
		map.put(student4, 6);
		map.put(student5, 3);

		System.out.println(map);

		Map<List<Student>, Integer> map1 = new HashMap<>();
		map1.put(list, 1);

		System.out.println(map1);
	}
}
