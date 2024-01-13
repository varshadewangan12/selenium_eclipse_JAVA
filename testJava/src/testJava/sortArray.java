package testJava;

public class sortArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int[] arr= {1,3,4,5,9,9,12,12,9,1};
		int temp=0;
		
	for(int i=0;i<arr.length-1;i++)
	{
		for(int j=i+1;j<arr.length-1;j++)
		{
			if(arr[i]>arr[j])
			{
				temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
		}
		System.out.print(arr[i]);
		
	}
	
	}
}

