package testJava;
import java.util.Map;
import java.util.HashMap;
import java.util.*;

public class CountCharAndOcc {

	public static void main(String[] args) {
		
		String str="beautiful beach";
		
		HashMap<Character,Integer> map=new HashMap<>();
		
		char[] arr=str.toCharArray();
		
		for(int i=0;i<=arr.length-1;i++)
		{
			if(map.containsKey(arr[i]))
			{
				map.put(arr[i], map.get(arr[i])+1);
			}
			else
			{
				map.put(arr[i], 1);
			}
		}
		
		Set<Map.Entry<Character,Integer>> data=map.entrySet();
		
		System.out.print(data);
		
		for(Map.Entry<Character,Integer> entry:map.entrySet())
		{
			System.out.println(entry.getKey()+"="+entry.getValue());
			
		}
		
		

	}

}
