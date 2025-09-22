package com.code;

import java.util.Arrays;
import java.util.List;

public class StringToUppercase {
	public static void main(String ar[]) {
		List<String> names = Arrays.asList("avinash", "rahul", "deepak");
		
		names.stream()
		.map(String::toUpperCase)
		.forEach(System.out::println);
	}

}
