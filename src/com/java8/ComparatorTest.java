package com.java8;

import java.util.List;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;

class User{
	String uname;
	int id;
	public User(String uname, int id) {
		
		this.uname = uname;
		this.id = id;
	}
	@Override
	public String toString() {
		return "uname=" + uname + ", id=" + id ;
	}	
}
public class ComparatorTest {
	public static void main(String[] args) {
		List<User> user=Arrays.asList(new User("Sharath", 1),new User("Sharun", 2),new User("Supraj", 3));
		user.forEach(System.out::println);
	}
}
 class NamComparator implements Comparator<User>{
			@Override
			public int compare(User o1, User o2) {
				// TODO Auto-generated method stub
				return o1.id-o2.id;
			}
			
 }