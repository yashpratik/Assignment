package java8;

import java.util.*;
import java.util.stream.Collectors;

class Question_2 {

	public static void main(String[] args) {

		// Creating a list of integers
		List<Integer> list = Arrays.asList(1, 1, 2, 3, 3, 4, 5, 5);

		System.out.println("The distinct elements are :");

		// using Stream.distinct() method
		List<Integer> dis=list.stream().distinct().collect(Collectors.toList());
		
		System.out.println(dis);
	}
}