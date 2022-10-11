package streamapidemo;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamApiDemo2 {

	public static void main(String[] args) {
 
		
		Stream<Object> stream1=Stream.empty();
		System.out.println(stream1);
		
		String strArray[]= {"Amit", "Shiva" , "Shubham", "Sandeep"};
		
		Stream<String> stream2=Stream.of(strArray);
		stream2.forEach(e->{
			System.out.println(e);
		});
		
		Stream<Object> stream3=Stream.builder().build();
		stream3.forEach(e->{
			System.out.println(e);
		});
		
		IntStream stream4=Arrays.stream(new int[] {2,5,8,30,45});
		stream4.forEach(e->{
			System.out.println(e);
		});
		
	}
}
