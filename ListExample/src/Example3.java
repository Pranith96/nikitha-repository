import java.util.Vector;

public class Example3 {

	public static void main(String[] args) {
		Vector<Integer> list = new Vector<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		list.add(7);
		list.add(8);
		list.add(9);
		
		System.out.println(list);
		System.out.println(list.get(3));
		System.out.println(list.size());
		System.out.println(list.contains(7));
		System.out.println(list.equals(1));
		System.out.println(list.indexOf(1));
		System.out.println(list.isEmpty());

		list.remove(0);
		System.out.println(list);
	}
}
