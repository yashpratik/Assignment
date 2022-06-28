package java8;

import java.util.stream.IntStream;

public class Question_14 {

	public static void main(String[] args) {
		System.out.println("All pemutetions of given String :");
		stringPermuteAndPrint("", "ABCD");

	}

	private static void stringPermuteAndPrint(String prefix, String str) {
		int n = str.length();
		
		if (n == 0) {
			
			System.out.println(prefix + " ");
		} else {
			IntStream.range(0, n).parallel().forEach(
					i -> stringPermuteAndPrint(prefix + str.charAt(i), str.substring(i + 1, n) + str.substring(0, i)));
		}
	}

}