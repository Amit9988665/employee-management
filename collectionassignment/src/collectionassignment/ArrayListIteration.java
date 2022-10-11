package collectionassignment;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class ArrayListIteration {

	public static void main(String[] args) {
		List<Integer> arraylist = new ArrayList<Integer>();
		arraylist.add(10);
		arraylist.add(30);
		arraylist.add(52);
		arraylist.add(35);
		arraylist.add(32);

		Iterator<Integer> itr = arraylist.iterator();
		System.out.println("using itrater inteface");
		while (itr.hasNext()) {
			Integer integer = (Integer) itr.next();
			if (integer == 10) {
				System.out.println(integer);
			}

			System.out.println(integer);
		}
		System.out.println("iterate using lamda expression");
		arraylist.forEach(e -> {

			System.out.println(e);
		});

		System.out.println("using stream api");
		Stream<Integer> stream = arraylist.stream();
		stream.forEach(e -> {
			System.out.println(e);
		});
	}

}
