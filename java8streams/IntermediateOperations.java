package java8streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class IntermediateOperations {
	public static void main(String[] args) {

		// Given list of numbers filter only odd numbers
		List<Integer> numbersList1 = Arrays.asList(1, 2, 3, 4, 5);
		numbersList1.stream().filter(n -> n % 2 == 1).forEach(n -> System.out.print(n + ","));

		// Find the square of all elements in the numbers array
		int[] numberArray = { 1, 2, 3, 4, 5 };
		Arrays.stream(numberArray).map(n -> n * n).forEach(n -> System.out.print(n + ","));

		List<Integer> numbersList2 = Arrays.asList(1, 2, 3, 4, 5, 6);
		numbersList2.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList())
				.forEach(n -> System.out.print(n + ","));

		// Remove all duplicate numbers from the list
		List<Integer> numbersList3 = Arrays.asList(10, 10, 30);
		numbersList3.stream().distinct().forEach(n -> System.out.print(n + ","));

		// Get the marks of first 3 toppers
		List<Integer> numberList4 = Arrays.asList(10, 20, 30, 40, 50, 60);
		numberList4.stream().sorted().limit(3).forEach(n -> System.out.print(n + ","));

		// Skip first 3 elements of a number list
		List<Integer> numberList5 = Arrays.asList(10, 20, 30, 40, 50, 60);
		numberList5.stream().skip(3).forEach(System.out::println);
		
		//eg Flatten list of list containing odd and even numbers into a single list of numbers.
		List<List<Integer>> listOfList = Arrays.asList(Arrays.asList(1, 3, 5, 7, 9), Arrays.asList(2, 4, 6, 8, 10));
		List<Integer> flattenedNumbersList = listOfList.stream().flatMap(numbers -> numbers.stream())
				.collect(Collectors.toList());

		System.out.println("Flattened Numbers" + flattenedNumbersList);
		
		Stream.of(1,2,3,4,5,6,7,8,9,10)
        .filter(e -> e%3==0)
        .peek(e -> System.out.println("Values divisible by 3: " + e))
        .map(e -> e*e)
        .peek(e -> System.out.println("Squared Value: " + e))
        .collect(Collectors.toList());

	}

}
