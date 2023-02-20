import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public class Example {

	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<>(); // LinkedHashMap , TreeMap
	//	ConcurrentMap<Integer, String> m = new ConcurrentHashMap<>();
		map.put(1, "ABC");
		map.put(2, "BYS");
		map.put(3, "QWE");
		map.put(4, "ASD");
		map.put(5, "BGF");
		map.put(null, "PQR");
		map.put(6, null);
		map.put(7, "NJM");
		map.put(2, "LOK");
		map.put(8, null);
		map.put(4, "BCG");
		map.put(9, "ASX");
		map.put(1, "BHD");
		map.put(null, "XYZ");

		System.out.println(map);
		System.out.println(map.get(1));
		String value = map.get(1);
		System.out.println(value);
		map.remove(9);
		System.out.println(map);
		System.out.println(map.keySet());
		System.out.println(map.values());
		System.out.println(map.containsKey(2));
		System.out.println(map.containsValue("HG"));

		for (Map.Entry<Integer, String> data : map.entrySet()) {
			System.out.println(data.getValue());
			System.out.println(data.getKey());
		}
	}
}
