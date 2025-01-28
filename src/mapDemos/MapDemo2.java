package mapDemos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Employee{
	int id;
	String name;
	int salary;
	public Employee(int id, String name, int salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
}
public class MapDemo2 {

	public static void main(String[] args) {
		List<Employee> list = Arrays.asList(
				new Employee(101, "Shubham", 25000),
				new Employee(102, "Shrestha", 35000),
				new Employee(103, "Aish", 15200),
				new Employee(104, "Akshay", 6500));
		List<Double> output = new ArrayList<>();
		
		//combination of filter() and map()
		//eg.1 - give 10% hike to each employee
//		output = list.stream().map(emp->emp.salary*0.3+emp.salary).collect(Collectors.toList());
		
		//eg.2 - give 10% hike to employee whose salary is below 10000
		output = list.stream().filter(emp->emp.salary<10000).map(emp->emp.salary*0.1+emp.salary).collect(Collectors.toList());
		
		System.out.println(output);
		
		 List<String> words = Arrays.asList("apple", "banana", "cherry");
	        words.stream()
	             .map(String::length)  // Get the length of each word
	             .forEach(System.out::println);  // Output: 5, 6, 6
	}

}
