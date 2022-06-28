package java8;

import java.util.Arrays;
import java.util.OptionalDouble;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Question_1 {

	private static Scanner scanner;

	public static void main(String[] args) {

		System.out.println("Enter how many marks you want to use to calculate the average");

		scanner = new Scanner(System.in);

		int number = scanner.nextInt();

		int[] arr = new int[number];

		System.out.println("\nEnter marks now\n");
		for (int i = 0; i < number; i++) {
			System.out.println("Enter marks of subject " + i + 1 + ":");
			arr[i] = scanner.nextInt();
		}

		IntStream streamOfMarks = Arrays.stream(arr);

		OptionalDouble averageOfMarks = streamOfMarks.average();

		System.out.println("\nAverage of Marks: " + averageOfMarks);

	}
}