package java8streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Step1StreamCreation {
	public static void main(String[] args) {
		//From Collection like List
		List<Integer> numbersList=Arrays.asList(1,2,3,4,5);
		Stream s1 =numbersList.stream();

		//From Arrays
		int[] numberArray1= {1,2,3,4,5};
		IntStream s2 = Arrays.stream(numberArray1);

		//Using Static Factory Methods
		Stream<Integer> s3= Stream.of(1, 2, 3, 4, 5, 6, 7, 8);
		// creates an empty stream
		Stream<String> emptyStream = Stream.empty();
	}
}
