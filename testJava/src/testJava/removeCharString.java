package testJava;

public class removeCharString {

	public static void main(String[] args) {
		 
		String str= "java is programming language";
		   
		
		//remove a from given string
		
		String str2=str.replace("a","");
		
		System.out.print(str2);
		
		// remove all lowercase from string
		
	
	System.out.print(str.replaceAll("([a-z])",""));	
		
	// remove whitespace
	
	System.out.print(str.replace(" ", ""));
	
	//remove substring in string
	
	System.out.print(str.replace("va",""));
	
	// remove last character from string
	
	System.out.print(str.substring(0, str.length()-1));
	
	
	
	
		
		

	}

}
