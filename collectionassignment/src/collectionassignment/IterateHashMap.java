package collectionassignment;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class IterateHashMap {

	public static void main(String[] args) {
		HashMap<Integer, String> mapList=new HashMap<Integer, String>();
		mapList.put(101, "Amit");
		mapList.put(102, "sandeep");
		mapList.put(103, "Chirag");
		mapList.put(104, "Sonu");
		mapList.put(105, "saurav");
		mapList.put(106, "indal");
		mapList.put(107, "Amit");
		mapList.put(108, "sandeep");
		
		System.out.println("Using Lamda expresion");
	//mapList.entrySet().stream()
		mapList.forEach((k,v)->
		{
			System.out.println("id = "+ k + "name = "+ v);
		});
		
		System.out.println("Using Iterator Interface");
		Iterator <Integer> itr = mapList.keySet().iterator();  
		while (itr.hasNext()) {
			 
			System.out.println("Id := "+itr.next() +"name :=" + mapList.get(itr.next()));
			
		}
		
		for(Integer key: mapList.keySet())
		{
			System.out.println(key);
			
		}
		for(String name :mapList.values())
		{
			System.out.println(name);
		}
		
		for(Map.Entry<Integer, String> entry: mapList.entrySet())
		{
			System.out.println("Id = "+entry.getKey() +" name = "+entry.getValue());
		}

		
	}

}
