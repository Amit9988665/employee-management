package collectionassignment;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class CheckElementInArrayList {

	public static void main(String[] args) {
		
		List<String> nameList=new ArrayList<String>();
		nameList.add("shiva");
		nameList.add("Amit");
		nameList.add("Anil");
		nameList.add("chirag");
		nameList.add("shbham");
		nameList.add("sandeep");
		nameList.add("khus");
		nameList.add("ram");
		nameList.add("monu");
		//nameList.add("Amit");
		
		Stream<String> stream=nameList.stream();
		stream.forEach(e->
		{
			if (e=="Amit") {
				System.out.println(e);
			}
		});
	}
}
