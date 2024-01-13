package testJava;

public class countNoChar {

	public static void main(String[] args) {
		String str="coder rolls rolling";
		//System.out.print(str.length());
		
		//str.split("//s")
	
		int count=0;
		char[] arr=str.toCharArray();
		
		for(int i=0;i<=arr.length-1;i++)
		{
        	
        	if(arr[i]=='l')
        	{
        		count++;
        	}
        		
        	}
        		
        	
         System.out.print(count);
	}

}
