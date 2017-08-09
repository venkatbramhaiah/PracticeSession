package Basics;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class DuplicateCharinString {

	public static void main(String[] args) {

		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a String to find the duplicates ");
		String str=sc.next();
		 char ch[]=str.toCharArray();
		    Map<Character, Integer> map = new HashMap<Character, Integer>(); 

		 for(char ch1:ch){
			 
			 if(map.containsKey(ch1)){
				 map.put(ch1, map.get(ch1)+1);
			 }else{
				 map.put(ch1, 1);
			 }
		 }
		    Set<Character> keys = map.keySet();
		    for(char ch2: keys){
		    	if(map.get(ch2)>1){
		    		System.out.println("Char "+ch2+" "+map.get(ch2));
		    	}
		    }

	}

}
