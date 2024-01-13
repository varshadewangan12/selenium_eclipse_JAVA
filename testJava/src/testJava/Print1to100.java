package testJava;

public class Print1to100 {

	public static void main(String[] args) {
		
		String st="";
		for(int i=1;i<=10;i++)
		{
			if(i%3==0)
			{
				st=st+"fuzz";
			}
			else if(i%5==0)
			{
				st=st+"buzz";
			}
			else {
				st=st+i;
			}
			
		}
		System.out.print(st);
	 
}
}

