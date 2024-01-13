package testJava;
import java.util.*;

public class IterateArrayList {

	public static void main(String[] args) {
		
		ArrayList list= new ArrayList();
		list.add("one");
		list.add("two");
		list.add("three");
		list.add("four");
		list.add("five");
		
	//using while loop
		Iterator itr=list.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
 //using for loop
		
		for(int i=0;i<=list.size()-1;i++ )
		{
			System.out.println(list.get(i));
		}
		
	}

}
