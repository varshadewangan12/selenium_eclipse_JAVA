package testJava;

import java.util.Arrays;

public class AnagramString {

	public static void main(String[] args) {
		String str1= "army";
		String str2="mary";
		 
		char[] arr1=str1.toLowerCase().toCharArray();
		char[] arr2=str2.toLowerCase().toCharArray();
		
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		
		 boolean result=Arrays.equals(arr1, arr2);
		 
		 System.out.println(result);
		 
			 
		 
		
		

	}

}
