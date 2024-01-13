package testJava;

public class ArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=153;
		int rem;
		int digit=0;
		
		while(n!=0)
		{
			rem=n%10;
			digit=digit+(int)Math.pow(rem,3);
			n=n/10;
			
			
		}
		
	System.out.print(digit);

	}

}
