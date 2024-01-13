package testJava;

public class ReverseWordsSentence {

	public static void main(String[] args) {
		
		String str="java is programming langauge";
		
		String[] sarr=str.split("\\s+");
		
		System.out.print(sarr.length);
		
		for(int i=0;i<=sarr.length-1;i++)
		{
                 char[] arr=sarr[i].toCharArray();
                 
            
		
		for(int j=arr.length-1;j>=0;j--)
		{
			System.out.print(arr[j]);
		
		}
		
		System.out.print(" ");
		}
	

	}

}
