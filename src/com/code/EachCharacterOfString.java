package com.code;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class EachCharacterOfString {

	public static void main(String[] args) {
	String str="Avinash";
	
	//java 1.8 coding
	Map<Character,Long> countOfCharacter=
			str.chars()
			.mapToObj(p->(char)p)
			.collect(Collectors.groupingBy(p->p,Collectors.counting()));
	System.out.println(countOfCharacter);

	//Lengthy code
	Map<Character ,Long> countOfChar=new HashMap<>();
	char[] ch=str.toCharArray();
	
	for(char c:ch) {		
		if(countOfChar.containsKey(c)) {
			countOfChar.put(c, countOfChar.get(c)+1);
		}
		else {
			countOfChar.put(c, 1l);
		}
	}	
	System.out.println(countOfChar);
	
	}

}
