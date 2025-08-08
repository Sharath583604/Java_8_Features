package com.streamApi;

import java.util.Arrays;
import java.util.List;


public class Operations {
	
	
	public static void main(String[] args) {
		//Combine 2 List
		
				List<String> developers=Arrays.asList("Sharath","Sharun","Prajwal","Rahul","Prathiksha");
				
				List<String> tester=Arrays.asList("Sharath","Adnaan","Akshay","Sudeep","Sneha","Prathiksha");
				
				List<List<String>> emplist=Arrays.asList(developers,tester);
				
				System.out.println(emplist);
				
				
				
				System.err.println("Flattened List");
				
				List<String> flattened=emplist.stream().flatMap(List::stream).toList();
				
				
				System.out.println(flattened);
				
				System.err.println("Removing Duplicates");
				
				flattened.stream().distinct().forEach(System.out::println);
				
				
	}

}
