package testJava;

public class Palindrom {

	public static void main(String[] args) {
		String str1="abba";
		String str2="abba";
		
		str1.toLowerCase();
		char[] arr=str2.toLowerCase().toCharArray();
		
		for(int i=arr.length-1;i>=0;i--)
		{
			 System.out.print(arr[i]);
		}
		
		if(str1.equals(str2))
		{
			System.out.print("Strings are palindrom");
		}
		
		else
		{
			System.out.print("Strings are not palindrom");
		}
		
		
		

	}

}
