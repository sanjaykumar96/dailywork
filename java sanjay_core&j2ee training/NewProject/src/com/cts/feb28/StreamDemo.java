package com.cts.feb28;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamDemo {
	public static void main(String[] args) {
		ArrayList<String> names = new ArrayList<>();
		addNames(names);
//		
//1 print names with moore than 6
//
//		List<String> nameswithlesssthan6 = names.stream().filter(s -> s.length() > 6).collect(Collectors.toList());
//       System.out.println("****names with greater than 6***");
//       nameswithlesssthan6.forEach(System.out::println);
//       names in upper case
//		List<String> namesinuppercase = names.stream().map(s -> s.toUpperCase()).collect(Collectors.toList());
//		System.out.println("*****in upper case***");
//		namesinuppercase.forEach(System.out::println);
//		3.count
//		long count = names.stream().count();
//		System.out.println("list count is: " + count);
//		Stream<Integer> data = Stream.of(1, 11, 111, 1111, 11111, 122);
//		System.out.println("Data count: " + data.count());

		Stream<String> language = Stream.of("c", "c++", "java", "python", "Angular");
//		Stream<String> morethan4 = language.filter(s -> s.length() > 4);
//		System.out.println("******more than 4 word****");
//		morethan4.forEach(System.out::println);
		
//		// 3. Default sort (Ascending order)
//		List<String> defaultSorted = names.stream().sorted().collect(Collectors.toList());
//		System.out.println("********** Default Sorting **********");
//		defaultSorted.forEach(System.out::println);
//		
//		
//		// 4. Custom sorting (Descending order)
//		List<String> customSorted = names.stream().sorted((s1, s2) -> -s1.compareTo(s2)).collect(Collectors.toList());
//		System.out.println("********** Custom Sorting **********");
//		customSorted.forEach(System.out::println);
		
		
		// String joinedString = language.collect(Collectors.joining(" programming"));
		// //illegal

		 Stream<String> morethan=language.map(s->s.concat("  programming"));
		 morethan.forEach(System.out::println);

	}

	private static void addNames(ArrayList<String> names) {
		// TODO Auto-generated method stub
		names.add("neeraj");
		names.add("harshita");
		names.add("nraj");
		names.add("pulkit");
		names.add("abhishek");
		names.add("mayuresh");
	}

}
