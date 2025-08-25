package java8streams;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TerminalOperations {
	public static void main(String[] args) {
		List<Integer> numList1= Arrays.asList(1, 2, 3, 4, 5);
		numList1.stream().forEach(n -> System.out.println("n=" + n));
		
		List<Integer> numList2= Arrays.asList(10, 20, 30, 40, 50);
		Integer[] intArray = numList2.stream().toArray(Integer[]::new);
		System.out.println(Arrays.toString(intArray));
		
		int result = Stream.of(1,2,3,4,5)
			    .reduce(0,(n1,n2)->(n1+n2));
			 
		System.out.println("Sum of all elements in the input stream is "+result);
		
		
		List<String> countries = Arrays.asList("India", "Australia", "Canada");
		Map<String,Integer> countryLengthMap = countries
		                                        .stream()
		                                        .collect(Collectors.toMap(name->name,name->name.length()));
		System.out.println("Map: " + countryLengthMap);
		
		List<Integer> numList3= Arrays.asList(30,23,1,45,2,3,4);
		int min = numList3.stream().min(Integer::compareTo).get();
		int max = numList3.stream().max(Integer::compareTo).get();
		long count = numList3.stream().count();
		System.out.println(" Min: " + min + " Max: " + max+" Count: " + count);
		
		List<Integer> numList4= Arrays.asList(3, 6, 9, 12, 15);
		//anyMatch → checks if ANY element matches condition
		boolean anyDivBy3= numList4.stream().anyMatch(n -> n % 3== 0);
		System.out.println("Any numbers divisible by 3? " + anyDivBy3);
		//allMatch → checks if ALL elements match condition
		boolean allDivBy3= numList4.stream().allMatch(n -> n % 3== 0);
		System.out.println("All numbers divisible by 3? " + allDivBy3);
		
		List<String> names = List.of("singing", "dancing", "play", "write");
		Optional<String> firstA =
		      names.stream()
		           .filter(s -> s.contains("ing"))
		           .findFirst(); 
		Optional<String> anyA =
		      names.stream()
		           .filter(s -> s.contains("ing"))
		           .findAny();
		System.out.println(firstA.get()+ " "+ anyA.get());
		
		
	}
}
