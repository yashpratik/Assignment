package java8_Employee;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.Scanner;
import java.util.Set;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;

public class TestEmp {
	public static void main(String[] args) throws ParseException {
		List<emp> elist = new ArrayList<emp>();

		elist.add(new emp("Cinmay", "11-02-1998", "21-03-2022", "21-03-2026", "Pune", "IT", 25000));
		elist.add(new emp("Ajay", "08-07-1999", "21-03-2022", "21-03-2028", "Indor", "SAP", 45000));
		elist.add(new emp("Pratik", "06-05-1999", "21-03-2021", "09-12-2030", "Pune", "IT", 30000));
		elist.add(new emp("Bhushan", "11-02-1997", "21-03-2025", "21-03-2026", "Mumbai", "Testing", 15000));
		elist.add(new emp("Vinod", "11-02-1997", "21-03-2025", "21-03-2026", "Mumbai", "IT", 15000));
		elist.add(new emp("Sagar", "11-02-2000", "21-03-2023", "21-03-2029", "Indor", "Testing", 20000));

		Scanner sc = new Scanner(System.in);
		System.out.println("Employee in a particular department");
		System.out.println("Enter department Name :");
		String dep = sc.next();
		List<emp> el = elist.stream().filter(d -> d.department.contains(dep)).collect(Collectors.toList());
		el.stream().forEach(System.out::println);
		
		System.out.println("--------------------------------------------------------------------------------------");
		
		System.out.println(" Average salary of each department");
		System.out.println("Enter department Name :");
		String dep1=sc.next();
		Map<String, Double> avgSalaryOfDepartments = elist.stream().filter(e->e.department.contains(dep1)).collect(
				Collectors.groupingBy(emp::getDepartment, Collectors.averagingDouble(emp::getSalary)));

		Set<Entry<String, Double>> entrySet = avgSalaryOfDepartments.entrySet();

		for (Entry<String, Double> entry : entrySet) {
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}
		
		System.out.println("--------------------------------------------------------------------------------------");
		
		
		System.out.println("Enter Department Name :");
		String dep11 = sc.next();
		Map<String, Optional<emp>> map = elist.stream().filter(d -> d.department.contains(dep11)).collect(Collectors
				.groupingBy(emp::getDepartment, Collectors.maxBy(Comparator.comparingDouble(emp::getSalary))));
		map.entrySet().forEach(System.out::println);
		Map<String, Optional<emp>> map1 = elist.stream().filter(d -> d.department.contains(dep11)).collect(Collectors
				.groupingBy(emp::getDepartment, Collectors.minBy(Comparator.comparingDouble(emp::getSalary))));
		map1.entrySet().forEach(System.out::println);
		
		System.out.println("--------------------------------------------------------------------------------------");
		
		System.out.println(" Department with highest no of employee and lowest no of employee");
		
		Map <String , Long> noemp = elist.stream().collect(Collectors.groupingBy(emp::getDepartment,Collectors.counting()));
		System.out.println(noemp);
		
		
	}
}
