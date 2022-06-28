package java8;

import java.util.Arrays;
import java.util.function.IntPredicate;

public class Question_8
{
	public static void main(String[] args) 
	{
		int a[]= {5,6,9,1,4,1,4,8,9,3,8};
		
		IntPredicate p1 = n -> n % 2==0;
		System.out.println("Even Numbers :");
		Arrays.stream(a).filter(p1).forEach(System.out::print);
		System.out.println("--------------------------------");
		
		IntPredicate p2 = n -> n % 2==1;
		System.out.println("Odd Numbers :");
		Arrays.stream(a).filter(p2).forEach(System.out::print);
	}
}
