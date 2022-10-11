package streamapidemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamDemo1 {

	public static void main(String[] args) {
		List<Integer> list1=new ArrayList<>();
		list1.add(2);
		list1.add(7);
		list1.add(9);
		list1.add(12);
		list1.add(30);
		list1.add(45);
		list1.add(60);
		
		Collections.sort(list1); 
		for(int marks: list1)  
		{  
		System.out.println(marks);  
		}  
		
	 
		
		List<Integer> evenList=new ArrayList<>();
		List<Integer> oddList=new ArrayList<>();
		
		for(Integer i:list1) {
			if (i%2==0) {
			evenList.add(i);	
			
			}
		 
		}
		System.out.println(evenList);
		for(Integer i:list1) {
			if (i%2!=0) {
			oddList.add(i);	
			
			}
		 
		}
		System.out.println(oddList);
		
		Stream<Integer> stream=list1.parallelStream();
		List<Integer> newList=stream.filter(i->i%2!=0).collect(Collectors.toList());
		System.out.println("hello");
		System.out.println(newList);
		
		
		List<Integer> newList2=list1.stream().filter(i->i%2==0).collect(Collectors.toList());
		System.out.println(newList2);
		
		
	}

}
