package testJava;

public class checkParticularNumberFunction {

	//public static void main(String[] args) {
		
		static int arr[]= {1,2,3,4};
		
		static void check(int b)
		{
			boolean status = false;
			for(int i=0;i<=arr.length-1;i++)
			{
				//int a=2;
				
				if(arr[i]==b)
				{
			     status=true;
				
		         break;
				}
			
			}
			
			System.out.println(status);
		
		
		}
		public static void main(String[] args) {
			check(5);
			
			//System.out.print("array contains 3"+status);
		}

	}


