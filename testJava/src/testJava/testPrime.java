package testJava;

public class testPrime {

	public static void main(String[] args) {
		
		String str1="test";
		String str2="code";
		
		str1=str1+str2;
		
		str2=str1.substring(0,str1.length()-str2.length());
		
		System.out.println(str2);
		
		str1=str1.substring(str2.length());
		System.out.print(str1);
		
		
		
		
		
	}


}
