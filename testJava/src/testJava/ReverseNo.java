package testJava;
 import java.util.Scanner;
public class ReverseNo {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter a number=");
		 int num=sc.nextInt();
		 int original=num;
		 int reverse=0;
		 int digit;
		 
		 while(num!=0)
			{
				digit=num%10;
				reverse=reverse*10+digit;
				num=num/10;
			}
				
		 
		 System.out.println("Reversed:"+reverse);

		 if(original==reverse)
		 {
			 System.out.print("number is palindrom");
		 }
	}

}
