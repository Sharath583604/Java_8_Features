package com.streamApi;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class EmployeeOperation {
	public static void main(String[] args) {
		System.out.println("Object operation");

		List<Employee> emp = Arrays.asList(new Employee("sharath", "developer", 300000),
				new Employee("sharun", "Tester", 400000), new Employee("pratiksha", "developer", 50000),
				new Employee("Rahul", "SDE", 900000));

		Stream<Employee> str = emp.stream();

		List<Employee> devlop = str.filter(i -> (i.desg.equalsIgnoreCase("developer"))).toList();

		devlop.forEach(System.out::println);

		System.out.println("startsWith Method");
		List<Employee> fist = emp.stream().filter(i -> i.ename.startsWith("s")).toList();

		fist.forEach(n -> System.out.println(n.ename));

		System.out.println("uppercase ");

		emp.stream().filter(i -> i.ename.startsWith("s")).map(n -> n.ename.toUpperCase()).forEach(System.out::println);

		System.out.println("Sorting method");

		emp.stream().sorted(Comparator.comparing(Employee::getEname).reversed()).forEach(System.out::println);

		System.out.println("MAX Method");

		Employee emp1 = emp.stream().max(Comparator.comparing(Employee::getSal)).orElseThrow();

		System.out.println(emp1);

		System.out.println("Second Max");

		emp.stream().sorted(Comparator.comparing(Employee::getSal).reversed()).skip(1).limit(1)
				.forEach(System.out::println);

	}

}
