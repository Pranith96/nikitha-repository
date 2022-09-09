
public class Example {

	public static void main(String[] args) {

		String s = "Hello";
		String s1 = "Hello";
		String s2 = new String("Hello");

		if (s == s1) {
			System.out.println("Hi");
		}

		if (s == s2) {
			System.out.println("Hello");
		}

		if (s.equals(s2)) {
			System.out.println("Java");
		}

		s = s.concat("World");
		System.out.println(s);

		System.out.println(s.charAt(1));
		System.out.println(s.contains("el"));
		System.out.println(s.endsWith("d"));
		System.out.println(s1.equalsIgnoreCase("HELLO"));
		System.out.println(s1.equals("HELLO"));
		System.out.println(s.isBlank());
		System.out.println(!s.isEmpty());
		System.out.println(s.length());
		System.out.println(s.toLowerCase());
		System.out.println(s.toUpperCase());
		System.out.println(s.substring(3));
		System.out.println(s.substring(0, 3));

		System.out.println(s.replace('o', 'q'));
		System.out.println(s.indexOf('e'));

		StringBuilder sb = new StringBuilder("Welcome");
		System.out.println(sb);
		sb.append("Java");
		System.out.println(sb);
		System.out.println(sb.reverse());
		
		StringBuffer sf = new StringBuffer("Welcome");
		System.out.println(sf);

	}
}
