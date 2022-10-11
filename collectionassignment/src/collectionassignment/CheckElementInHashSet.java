package collectionassignment;

import java.util.HashSet;
import java.util.Set;

public class CheckElementInHashSet {

	public static void main(String[] args) {
		Set<String> nameList=new HashSet<String>();
		nameList.add("shiva");
		nameList.add("Amit");
		nameList.add("Anil");
		nameList.add("chirag");
		nameList.add("shbham");
		nameList.add("sandeep");
		nameList.add("khus");
		nameList.add("ram");
		nameList.add("monu");
		//here duplicacy is not allow in Set Interface
		//nameList.add("Amit");
		
		nameList.forEach(e->{
			if (e=="Amit") {
				System.out.println(e);
			}
		});
	}

}
