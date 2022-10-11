package collectionassignment.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortArrayList {

	public static void main(String[] args) {

		List<Integer> arraylist = new ArrayList<Integer>();
		arraylist.add(10);
		arraylist.add(30);
		arraylist.add(52);
		arraylist.add(35);
		arraylist.add(32);

		Collections.sort(arraylist);
		Collections.reverse(arraylist);
		arraylist.forEach(e -> {
			System.out.println(e);
		});
		
		Collections.sort(arraylist, new SortUsingComparator());
		System.out.println(arraylist);
		
		 
		Collections.sort(arraylist);
		System.out.println(arraylist);
	}

}
