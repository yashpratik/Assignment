package java8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class Question_11 {

    public static void main(String[] args) {

    	List<Integer> list = new ArrayList<Integer>();
    	
    	list.add(11);
    	list.add(12);
    	list.add(13);
    	list.add(14);
    	list.add(15);
        System.out.println("Normal..."+list );

        System.out.println("Parallel...");

       
       list.stream().parallel().forEach(System.out::println);

    }

}