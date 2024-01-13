package testJava;

public class DuplicateChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str="beautiful beach";
		int count=0;
		
		char[] arr=str.toCharArray();
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					System.out.print(arr[j]);
					count++;
				
				
				}
				
			}
			
		}
		System.out.print(count);
	}

}
