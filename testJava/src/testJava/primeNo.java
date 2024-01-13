package testJava;

import java.util.Scanner;
public class primeNo {

	public static void main(String[] args)
	{
		
		Scanner sc=new Scanner(System.in);
		System.out.print("enter the number:");
		int number=sc.nextInt();
		
		if(isPrime(number))
		{
			System.out.print(number+"is prime number");
		}
		else
		{	
			System.out.print(number+ "is not prime number");
		}
		
		}
		
		static boolean isPrime(int n)
		{
			if (n<=1)
			{
				return false;
			}
			else {
				for(int i=2;i<n;i++)
				{
					if(n%i==0)
					{
						return false;
					}
				}
				return true;
			}
		
			
		
	}
	
}	

