package testJava;

public class swap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String str1="java";
        String str2="coding";
        
        str1=str1+str2;
        
        System.out.println(str1);
        
        str2=str1.substring(0, str1.length()-str2.length());
        
        System.out.println("String str2="+str2);
        
        str1=str1.substring(str2.length());
        
        System.out.println("sting str1="+str1);
	}

}
