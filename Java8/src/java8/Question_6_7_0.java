package java8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Question_6_7_0
{
	public static void main(String[] args) 
	{
		List<Question_6_7> ilist = new ArrayList<Question_6_7>();
		
		ilist.add(new Question_6_7(1,"Black T-Shirt",1000));
		ilist.add(new Question_6_7(2,"Jeans",1500));
		ilist.add(new Question_6_7(3,"Hoodie",800));
		ilist.add(new Question_6_7(4,"Shirt",1200));
		ilist.add(new Question_6_7(5,"Sunglass",199));
		
		int sum=0;
		for(Question_6_7 t :ilist) {
            sum += t.itemprice;
      }
      int avg = sum / ilist.size();
      
      //Print all Item name which Price is less than average Price of all Items.
      System.out.println("-------------------------");
      System.out.println("Average Price :"+avg);
      ilist.stream().filter((t -> t.itemprice<avg)).forEach(System.out::println);
      System.out.println("-------------------------");
      //Print even from the given item list
      ilist.stream().filter(a -> a.itemprice % 2==0).forEach(System.out::println);
	}
}
