package com.streamApi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;


public class StreamApi {
public static void main(String[] args) {
	List<Integer> list=Arrays.asList(1,2,3,4,5,6,7,8,9,10);
	Stream<Integer> stream=list.stream();
	stream.filter(i->(i%2==0)).forEach(System.out::println);
	
	List<Integer> oddnumbers=list.stream().filter(i->(i%2!=0)).toList();
	oddnumbers.forEach(System.out::println);
	
	List<Employee> emp=Arrays.asList(new Employee("sharath", "developer"),new Employee("sharun", "Tester"),new Employee("pratiksha", "developer"),new Employee("Rahul", "SDE"));
	
	Stream<Employee> str=emp.stream();
	
	List<Employee> devlop=str.filter(i->(i.desg.equalsIgnoreCase("developer"))).toList();
	devlop.forEach(System.out::println);
	
	List<Employee> fist=emp.stream().filter(i->i.ename.startsWith("s")).toList();
	fist.forEach(n->System.out.println(n.ename));
	
	
}
}
