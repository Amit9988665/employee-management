package collectionassignment;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.stream.Stream;

public class HashSetIterater {

	public static void main(String[] args) {
		Set<Integer> hashSetList = new HashSet<Integer>();
		hashSetList.add(10);
		hashSetList.add(30);
		hashSetList.add(52);
		hashSetList.add(35);
		hashSetList.add(32);

		Iterator<Integer> itr = hashSetList.iterator();
		System.out.println("using itrater inteface");
		while (itr.hasNext()) {
			Integer integer =  itr.next();
			if (integer == 10) {
				System.out.println(integer);
			}

			System.out.println(integer);
		}
		System.out.println("iterate using lamda expression");
		hashSetList.forEach(e -> {

			System.out.println(e);
		});

		System.out.println("using stream api");
		Stream<Integer> stream = hashSetList.stream();
		stream.forEach(e -> {
			System.out.println(e);
		});
	}

}
