package testJava;

public class SumArray {

	
		
	static	int array[]= {12,12,13,19};
		
		
		
	 static int sum()
		{
		int	sum=0;
			for(int i=0;i<=array.length-1;i++)
			{
				sum=sum+array[i];
			
			}
			return sum;
			
		}
		
	  public static void main(String[] args) {
				
			System.out.print("sum of array"+sum());
				

	}
}


