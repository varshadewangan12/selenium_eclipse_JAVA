package testJava;

public class SumequaltoArray {

	public static void main(String[] args) {
		
		int[] arr= {0,1,2,3,4,5,6};
		int b=5;
		
		for(int i=0;i<=arr.length-1;i++)
		{
			int a=arr[i]+arr[i+1];
			if(a==b)
			{
				System.out.print(arr[i]+","+arr[i+1]);
				break;
			}
		}

	}

}
