package collectionassignment.person;

import java.util.Comparator;

public class PersonCompareByName implements Comparator<Person>{

	@Override
	public int compare(Person p1, Person p2) {
		 
		return p1.name.compareToIgnoreCase(p2.name);
	}

}
