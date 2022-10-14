package postClassPractice;

import java.util.Comparator;
//importing the Comparator interface and instantiating it is needed when sorting objects, or arranging objects in a given
//list, array, etc. in the right order from lowest to highest
public class PostClassPractice {
	
	static PersonDao personDao = new PersonDao();
	
	public static void main(String[] args) {
//1-----METHOD REFERENCING SORT METHOD
		//Comparator<Person> comp;  //lines 17-19 are needed to sort out the List <People> person created in the PersonDao class
		//comp = Person ::comparePerson;
		//personDao.getPeople().sort(comp);
		//personDao.getPeople().forEach(System.out::println);
		
//2-----INNER CLASS SORT METHOD	
		Comparator <Person> comp;
		
		comp = new Comparator <Person> () {
			public int compare(Person p1, Person p2) {
				return Person.comparePerson(p1, p2);
//check out the comparePerson method in the Person class				
			}
		};
			personDao.getPeople().forEach(System.out::println);
			personDao.getPeople().sort(comp);
//using the pre-mase "sort" method with the created "comp" comparable interface containing person			
	}

//3-----LAMBDA SORT METHOD		
		//Comparator<Person> comp;  
		//comp = (Person p1, Person p2) -> 
		//Person.comparePerson(p1, p2);	
		//personDao.getPeople().sort(comp);
		//personDao.getPeople().forEach(person -> System.out.println(person.getFirstName()));
		
//4-----NORMAL CLASS SORTING METHOD
	//	PostClassPractice pcp = new PostClassPractice();
	//    Comparator<Person> comp = null;
	//	comp = new MySort();
	//	personDao.getPeople().sort(comp);
	//	for (Person person : personDao.getPeople()) {
	//		System.out.println(person.getFirstName());	
	//}
 }

//4---MySort class is needed for the normal class sorting method
//class MySort implements Comparator<Person> {
//	public int compare(Person p1, Person p2) {
//		return Person.comparePerson(p1, p2);//made in person class, comparing firstnames of two people together
//	}
	  
//  }

//personDao.getPeople().forEach(System.out::println);
		//for (Person person : personDao.getPeople()) {
		//	System.out.println(person);			
		//}
		//System.out.println(personDao.getPeople().toString());
		