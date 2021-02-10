public class Name
{
	public String firstName, lastName;
	public char mi;

	/*
	This creates a constructor with 3 parameters within the same class
	 */

	public Name() {
	this ("", "", "");
	}

	public Name(String firstName, char mi, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.mi = mi;
	}

	public Name(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public Name(String firstName, String s, String lastName) {
	}

	public String getFirstName() {
		return firstName;
	}

	public char getMi() {
		return mi;
	}

	public String getLastName() {
		return lastName;
	}

	public void setFirstName(String name) {
		this.firstName = firstName;
	}

	public void setMi(String Mi) {
		this.mi = mi;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getFullName() {
		if (mi == ' ')
			return (firstName + " " + lastName);
		else
			return (firstName + " " + mi + " " + lastName);
	}
}
