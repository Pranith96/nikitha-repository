import java.util.LinkedHashSet;
import java.util.Set;

public class Example1 {

	public static void main(String[] args) {
		Set<Integer> set = new LinkedHashSet<>(); //TreeSet,HashSet
		set.add(2);
		set.add(4);
		set.add(7);
		set.add(4);
		set.add(1);
		set.add(2);
		set.add(3);
		set.add(2);
		set.add(4);
		set.add(7);
		set.add(4);
		set.add(5);
		set.add(6);
		set.add(7);
		set.add(8);
		set.add(9);

		System.out.println(set);

		System.out.println(set);
		System.out.println(set.size());
		System.out.println(set.contains(7));
		System.out.println(set.equals(1));
		System.out.println(set.isEmpty());
		set.remove(0);
		System.out.println(set);
	}
}
