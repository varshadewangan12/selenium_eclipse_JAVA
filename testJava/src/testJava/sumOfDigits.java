package testJava;

public class sumOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=152;
		int rem;
		int sum=0;
		
		while(n!=0)
		{
			rem=n%10;
			sum=sum+rem;
			n=n/10;
			
		}
		System.out.println(sum);

	}

}
