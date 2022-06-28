package java8;

import java.util.ArrayList;
import java.util.List;

public class Quetion_5 
{
	public static void main(String[] args) 
	{
	String[] st = {"Ajay","Chinmay","Pratik","Sagar","Viki"};
	
	List<Integer> stcount = new ArrayList<Integer>();
	
	for(String s : st)
	{
		int count=0;
		char[]a = s.toCharArray();
		for(char ch : a)
		{
			count++;
		}
		stcount.add(count);
	}
	//System.out.println(stcount);
	Integer max = stcount.stream().max((s1,s2)->s1.intValue()>s2.intValue()?1:-1).get();
	int index = stcount.indexOf(max);
	System.out.println("Longest String in given Array :"+st[index]);
	System.out.println("And Count is :"+max);
}
}