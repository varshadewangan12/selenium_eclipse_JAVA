package testJava;

import java.util.Arrays;

public class duplicateremoveArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,1,2,2,3,4,4,5,6,6,7};
		int len=arr.length;
		int[] temp=new int[arr.length];
	
		int j=0;
		
		for(int i=0;i<arr.length-1;i++)
		{
			if(arr[i]!=arr[i+1])
			{
				temp[j++]=arr[i];
			}
		}
		temp[j++]=arr[arr.length-1];
		for(int k=0;k<j;k++)
		{
			System.out.print(temp[k]);
		}
	}

}
        