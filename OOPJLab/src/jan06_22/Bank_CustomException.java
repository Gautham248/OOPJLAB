package jan06_22;
import java.util.*;
import java.util.Arrays;

class Bank{
	private String acc_holder,acc_number,acc_type;
	private long acc_balance;
	Scanner sc=new Scanner(System.in);
	//To Open Account
	void OpenAccount()
	{
		System.out.println("Name of Account holder:  ");
		acc_holder=sc.next();
		System.out.println("Type of account       :  ");
		acc_type=sc.next();
		System.out.println("Account Number        :  ");
		acc_number=sc.next();
		System.out.println("Account Balance       :  ");
		acc_balance=sc.nextLong();
	}
	
	
	
	
	
}



//MAIN METHOD
public class Bank_CustomException {
	public static void main(String[] args) {
		Bank B=new Bank();
		Scanner sc=new Scanner(System.in);
		int choice;
		B.OpenAccount();
		System.out.println("--UBS GLOBAL WEALTH MANAGEMENT--\n");
		System.out.println("1.Display all account details");
		System.out.println("2.Search by account ");
		System.out.println("3.Deposit");
		System.out.println("4.Withdraw");
		System.out.println("5.Exit");
		do
		{
			System.out.println("Please enter your choice: ");
			choice=sc.nextInt();
			switch(choice)
			{
			case 1:
			case 2:
			case 3:
			case 4:
			case 5:
			{
				System.out.println("--THANK YOU--");
				break;
			}
			default :
				System.out.println("Couldnt find entered choice");
			}
			
		}while(choice!=5);
	}

}
