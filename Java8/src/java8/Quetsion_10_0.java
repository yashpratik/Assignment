package java8;

import java.util.ArrayList;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class Quetsion_10_0 
{
	public static void main(String[] args) 
	{
		ArrayList<Quetion_10> alist = new ArrayList<Quetion_10>();
		alist.add(new Quetion_10(1,"Ajay",250));
		alist.add(new Quetion_10(2,"Chinmay",50));
		alist.add(new Quetion_10(3,"Ankush",150));
		alist.add(new Quetion_10(4,"Bhushan",250));
		alist.add(new Quetion_10(5,"Pratik",250));
		alist.add(new Quetion_10(6,"Sagar",250));
		alist.add(new Quetion_10(7,"Viki",250));
		alist.add(new Quetion_10(8,"Ajay",250));
		alist.add(new Quetion_10(9,"vishal",250));
		alist.add(new Quetion_10(10,"Aklak",250));
		
		//Convert ArrayList to Map
		System.out.println("Converting ArrayList to Map :");
		Map<Integer, String> deptMap = alist.stream().collect(
                Collectors.toMap(Quetion_10::getItemId, Quetion_10::getItemName));
        
        deptMap.forEach((k,v)->System.out.println("DeptId (" + k + ") Name :" + v));
        
        //Convert ArrayList to set
        System.out.println("Converting ArrayList To Set :");
		Set<String> set = alist.stream().map(a->a.itemName)
                .collect(Collectors.toSet());
        System.out.println(set);
        
		}
}
