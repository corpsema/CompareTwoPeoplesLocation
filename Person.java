public class Person {
	public Name name;
	public String address;
	public String id;

	public Person() {
	}

	public Person(Name name, Address a, String id) {}

	public Person(String name, String address, String id) {}

	public Person(Name name1, Address address1) {
	}

	public void setAddress(String address) {
		this.address = address;
	}
	public String toString() {
		return (name+ "\n" + address);
	}

}
