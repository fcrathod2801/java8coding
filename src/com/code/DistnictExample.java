package com.code;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class DistnictExample {

	public static void main(String[] args) {
	
		//Distict Remove the duplicate Element code
		List<String> listOfStrings = Arrays.asList("Java", "Python", "C#", "Java", "Kotlin", "Python");
		listOfStrings.stream()
		.distinct()
		.forEach(System.out::println);		
		// sort by Length wise
		listOfStrings.stream()
		.sorted(Comparator.comparing(String::length))
		.forEach(System.out::println);
	}

}
