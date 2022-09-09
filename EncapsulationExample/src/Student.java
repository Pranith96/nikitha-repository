
public class Student {

	private int id;
	private String name;
	private String mobileNumber;

	private Address addition;

	public Address getAddition() {
		return addition;
	}

	public void setAddition(Address addition) {
		this.addition = addition;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", mobileNumber=" + mobileNumber + ", addition=" + addition
				+ "]";
	}

}
