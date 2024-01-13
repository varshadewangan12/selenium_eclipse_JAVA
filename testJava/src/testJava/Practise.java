package testJava;

import java.util.*;

public class Practise {
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num=1234;
		int digit;
		int reverse=0;
		
		while(num!=0)
		{
			digit=num%10;
			reverse=reverse*10+digit;
			num=num/=10;
		}
			System.out.print(reverse);	
				
	
	      
	
	
	}
}
       


