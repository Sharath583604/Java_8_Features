package com.java8;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

interface Calculator
{
	int calculate(int a,int b);
}
public class Operation {
	public static void main(String[] args) {
		Calculator add=(x,y)->{
			return x+y;
		};
		
		Calculator mul=(m,n)->m*n;
		System.out.println(add.calculate(10, 20));
		System.out.println(mul.calculate(5, 4));
		Calculator div=(d,v)->d/v;
		System.out.println(div.calculate(15, 5));
		
		List<String> names=Arrays.asList("sharath","rahul","prajwal");
		Collections.sort( names,(h,j)->h.compareTo(j));
		System.out.println(names);
	}

}
