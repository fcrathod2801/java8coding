package com.code;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Collectors;

public class SeperateEvenAndOddNumbers {

	public static void main(String[] args) {

        List<Integer> listOfIntegers = Arrays.asList(71, 18, 42, 21, 67, 32, 95, 14, 56, 87);
        Map<Boolean , List<Integer>> listOfEvenAndOddNumbers=
        		listOfIntegers.stream()
        		.collect(Collectors.partitioningBy(p->p%2==0));
        
        System.out.println(listOfEvenAndOddNumbers);
        
        Set<Entry<Boolean,List<Integer>>> value=listOfEvenAndOddNumbers.entrySet(); 
        
        for(Entry v:value) {
        	
        }

	}

}
