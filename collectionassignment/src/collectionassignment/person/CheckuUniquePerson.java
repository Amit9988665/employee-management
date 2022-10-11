package collectionassignment.person;

import java.util.HashSet;
import java.util.Set;

public class CheckuUniquePerson {

	public static void main(String[] args) {

		Person p1 = new Person(101, "Amit", 3000);
		Person p2 = new Person(101, "Amit", 3000);

		Set<Person> persons = new HashSet<Person>();

		persons.add(p1);
		persons.add(p2);
		
		System.out.println(persons);

	}

}
