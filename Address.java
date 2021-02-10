public class Address {
	public String street;
	public String city;
	public String state;
	public String Zip;


	// making street, city, state, and Zip all equal to null
	public Address() {
		street = "";
		city = "";
		state = "";
		Zip = "";
	}

	public Address(String street, String city, String state, String Zip) {
		this.street = street;
		this.city = city;
		this.state = state;
		this.Zip = Zip;
	}


	public String getStreet() {
		return street;
	}


	public String getCity() {
		return city;
	}


	public String getState() {
		return state;
	}


	public String getZip() {
		return Zip;
	}


	public void setStreet(String street) {
		this.street = street;
	}

	public void setCity(String city) {
		this.city = city;
	}


	public void setState(String state) {
		this.state = state;
	}

	public void setZip(String Zip) {
		this.Zip = Zip;
	}

	public String getfullAddress() {
		return (street + ", " + city + ", " + state + " " + Zip);
	}
}
