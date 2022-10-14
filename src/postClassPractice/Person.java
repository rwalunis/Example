package postClassPractice;

import java.util.ArrayList;
import java.util.List;

public class Person {
	
	String example;
	String firstName;
//	List <Person> people = new ArrayList (List.of(new Person ("Jody"), new Person ("Jimmy"), new Person ("Aby"), new Person ("Bobby")));
	
	public Person (String firstName) {
		this.firstName = firstName;
	}
//w/o this toString method, you would be unable to print out the correct items inside of the List of people.
//you're simple overriding what you are returning	
	public String toString() {
		return firstName;
		
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public static int comparePerson (Person one, Person two) {
		return one.getFirstName().compareTo(two.getFirstName());
	}
	

}
