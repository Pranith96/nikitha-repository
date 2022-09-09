
public class MainMethod {

	public static void main(String[] args) {
		Addition ad = new Addition();
		ad.add(10, 10);
		ad.add(10, 10, 10);
		long result = ad.add(100, 100, 10000l);
		System.out.println(result);
	}
}
