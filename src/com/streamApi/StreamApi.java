package com.streamApi;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class StreamApi {
	public static void main(String[] args) {

		// STREAM
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		Stream<Integer> stream = list.stream();
		stream.filter(i -> (i % 2 == 0)).forEach(System.out::println);

		list.stream().map(n -> n * n).forEach(System.out::println);

		System.out.println("Filter");

		List<Integer> oddnumbers = list.stream().filter(i -> (i % 2 != 0)).toList();
		oddnumbers.forEach(System.out::println);

	}
}
