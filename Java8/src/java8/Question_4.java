package java8;

import java.util.Arrays;

public class Question_4 
{
  public static void main(String[] args) 
  {
    int arry[] = {26, 98, 3333,1918, 2825};
    int max = Arrays.stream(arry).max().getAsInt();
    System.out.println("Largest Element is: " + max);
  }
}