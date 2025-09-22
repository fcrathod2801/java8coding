package com.code;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class EvenGreterThen {
	public static void main(String ar[]) {
		List<Integer> nums = Arrays.asList(3, 7, 12, 5, 18,11, 21);
		
Optional<Integer> n=	nums.stream()
		.filter(p->p>10)
		.findFirst();
	
	System.out.println(n.orElse(0));
	}
}
