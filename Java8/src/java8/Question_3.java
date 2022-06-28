package java8;

import java.util.*;
  
class Question_3 {
  
    public static void main(String[] args)
    {
  
        List<String> list = Arrays.asList("Chinmay", "Pratik", "Bhushan",
                                          "Ajay", "Ajay", "Chinmay");
  
        System.out.println("The distinct elements are :");
  
        // using Stream.distinct() method
        list.stream().distinct().forEach(System.out::println);
    }
}
