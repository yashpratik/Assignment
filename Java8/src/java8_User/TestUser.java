package java8_User;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;


class TestUser
{
	public static void main(String[] args) 
	{
		
		
		List<User> ulist = new ArrayList<User>();
		ulist.add(new User("hair Oil",250d,"2021-02-1","2022-02-1","hair_care_products"));
		ulist.add(new User(" Serums",300d,"2021-10-1","2022-10-1","Styling_Products"));
		ulist.add(new User("Hair Lotions & Tonics",1000d,"2021-8-12 ","2023-8-12","Styling_Products"));
		ulist.add(new User("dryers",800d,"2021-02-20","2022-02-20","hair_styling_tools"));
		ulist.add(new User("Wax",500d,"2021-05-12","2023-05-12","hair_care_products"));
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Category Name :");
		
		String cat = sc.next();
		List<User> ul = ulist.stream().filter(e->e.category.contains(cat)).collect(Collectors.toList());
		ul.stream().forEach(System.out::println);
		
		System.out.println("---------------------------------------------------------------------------------------------");
		
		System.out.println("Enter first letter of item :");
		String first_letter=sc.next();
		
		List<User> ul1 = ulist.stream().filter(e->e.itemName.startsWith(first_letter)).collect(Collectors.toList());
		ul1.stream().forEach(System.out::println);
		
		System.out.println("-----------------------------------------------------------------------------------------------");
		
		System.out.println("Enter item manufacturing date :");
		String dom=sc.next();
		System.out.println("Enter item Expiry date :");
		String doe = sc.next();
		
		List<User> u2 = ulist.stream().filter(d->d.d_manufacturing.contains(dom)||d.d_expiring.contains(doe)).collect(Collectors.toList());
		u2.stream().forEach(System.out::println);
		
		System.out.println("-----------------------------------------------------------------------------------------------");
		
		System.out.println("Enter Min item price :");
		double min = sc.nextDouble();
		System.out.println("Enter Max item price :");
		double max = sc.nextDouble();
		List<User> price = ulist.stream().filter(p->p.itemPrice>min && p.itemPrice<max).collect(Collectors.toList());
		price.stream().forEach(System.out::println);
	}
}