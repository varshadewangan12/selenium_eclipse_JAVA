package testJava;

public class countNoOfWords {

	public static void main(String[] args) {
		
		String input = "Java is a programming language";

        String[] str=input.split("\\s+");
        
        System.out.println(str.length);

	}

}
