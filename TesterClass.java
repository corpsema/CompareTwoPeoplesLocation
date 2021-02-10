import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class TesterClass<firstName1, lastName1, street1, city1, state1, Zip1, firstName2, lastName2, street2, city2, state2, Zip2> {

	Name name1 = new Name();
	Address address1 = new Address();

	Scanner input = new Scanner(System.in);

        System.out.println("Enter the first person's firstName: ");
		String firstName1 = input.next();
        name1.setfirstName(firstName1);
        name1.getFirstName();

        System.out.print("Enter the first person's lastname: ");
	String lastName1 = input.next();
        name1.setLastName(lastName1);
        name1.getLastName();

        name1.getFullName(firstName1, lastName1);

        System.out.print("Enter the first person's street: ");

	String street1 = input.next();
        address1.setStreet(street1);
        address1.getStreet();
        System.out.print("Enter the first person's city: ");

	String city1 = input.next();
        address1.setCity(city1);
        address1.getCity();
        System.out.print("Enter the first person's state: ");

	String state1 = input.next();
        address1.setState(state1);
        address1.getState();
        System.out.print("Enter the first person's zip: ");

	String Zip1 = input.next();
        address1.Zip(Zip1);
        address1.Zip();

        address1.getFullAddress(street1, city1, state1, Zip1);

	Person person1 = new Person(name1, address1);

	Name name2 = new Name();
	Address address2 = new Address();

	Scanner input1 = new Scanner(System.in);

        System.out.println("Enter the second person's firstName: ");
	String firstName2 = input1.next();
        name1.setfirstName(firstName2);
        name1.getFirstName();

        System.out.print("Enter the second person's lastname: ");
	String lastName2 = input1.next();
        name1.setLastName(lastName2);
        name1.getLastName();

        name1.getFullName(firstName2, lastName2);

        System.out.print("Enter the second person's street: ");

	String street2 = input1.next();
        address2.setStreet(street2);
        address2.getStreet();
        System.out.print("Enter the second person's city: ");

	String city2 = input1.next();
        address2.setCity(city2);
        address2.getCity();
        System.out.print("Enter the second person's state: ");

	String state2 = input1.next();
        address2.setState(state2);
        address2.getState();
        System.out.print("Enter the second person's zip: ");

	String Zip2 = input1.next();
        address2.Zip(Zip2);
        address2.Zip();


        address2.getFullAddress(street2, city2, state2, Zip2);

	Person person2 = new Person(name2, address2);

	System.out.println(person1.getFullAddress().equals(person2.getFullAddress));
	System.out.println("The 2 people don't live together");
}



