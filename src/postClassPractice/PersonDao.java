package postClassPractice;

import java.util.ArrayList;
import java.util.List;



public class PersonDao {
	
	public static List <Person> people = new ArrayList <> (List.of(new Person ("Jody"),
			new Person ("Mary"),
			new Person ("Bob"),
			new Person ("Arif"),
			new Person ("Kiki"),
			new Person ("Penelope")));

	public List<Person> getPeople() {
		return people;
	}

	//public void setPeople(List<Person> people) {
	//	this.people = people;
//	}
			
}
