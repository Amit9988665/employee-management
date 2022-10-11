package collectionassignment.person;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PersonMainClass {

	public static void main(String[] args) {

		Person p1 = new Person(101, "Amit", 2000);
		Person p2 = new Person(102, "Sandeep", 3000);
		Person p3 = new Person(105, "Anil", 7000);
		Person p4 = new Person(104, "Chirag", 6000);
		Person p5 = new Person(106, "Kundan", 9000);
		Person p6 = new Person(108, "Bablu", 4000);

		List<Person> personlist = new ArrayList<Person>();
		personlist.add(p1);
		personlist.add(p2);
		personlist.add(p3);
		personlist.add(p4);
		personlist.add(p5);
		personlist.add(p6);

		System.out.println("sort By Person Id");
		Collections.sort(personlist, new PersonComparator());
		for (Person person : personlist) {
			System.out.println(person.pid + " " + person.name + " " + person.salary);
		}

		System.out.println("Sort By Name");

		Collections.sort(personlist, new PersonCompareByName());
		for (Person person : personlist) {
			System.out.println(person.pid + " " + person.name + " " + person.salary);
		}

		System.out.println("Sort By Salary");

		Collections.sort(personlist, new PersonCompareBySalary());
		for (Person person : personlist) {
			System.out.println(person.pid + " " + person.name + " " + person.salary);
		}
		
	 Collections.sort(personlist);
	 System.out.println(personlist);
	}

}
