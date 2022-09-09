
public class MainMethod {

	public static void main(String[] args) {
		
		// college (id,name, code, Address)
		//course, studnt
		Address ad = new Address();
		ad.setPlotno(10);
		ad.setCity("ANBg");
		ad.setCountry("ab");
		ad.setState("vaj");
		
		Student st = new Student();
		st.setId(1);
		st.setName("ABC");
		st.setMobileNumber("1234567890");
		st.setAddition(ad);
		
		int id = st.getId();
		System.out.println(id);
		
		System.out.println(st);
	}
}
