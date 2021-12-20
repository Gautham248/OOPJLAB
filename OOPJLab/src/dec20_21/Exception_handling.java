package dec20_21;
import java.util.*;

public class Exception_handling {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int x=0;
		do {
		System.out.println("--Program to perform division--\n");
		System.out.println("Enter number 1: ");
		int num1=sc.nextInt();
		try {
		System.out.println("Enter number 2: ");
		int num2=sc.nextInt();
		System.out.println(num1/num2);
		}
		catch(ArithmeticException e) {
			System.out.println("Do not divide by Zero!!!");
		}
		finally {
			System.out.println("End of Operations");
		}
		System.out.println("Do you want to continue(y/n)?");
		char c=sc.next().charAt(0);
		if(c=='Y'||c=='y')
			x++;
		}while(x!=0);
				
	}

}
