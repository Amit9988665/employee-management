package collectionassignment.person;

import java.util.Comparator;

public class PersonComparator implements Comparator<Person> {

	@Override
	public int compare(Person p1, Person p2) {
		 
		if (p1.getPid()==p2.getPid()) {
			return 0;
		}
		else if (p1.getPid()>p2.getPid()) {
			return 1;
		}
		else {
			return -1;
		}
	}
	 
	 
	

}
