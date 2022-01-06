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
	//Show Account
	void ShowAccount()
	{
		System.out.println("Name of Account holder:  "+acc_holder);
		System.out.println("Type of account       :  "+acc_type);
		System.out.println("Account Number        :  "+acc_number);
		System.out.println("Account Balance       :  "+acc_balance);
	}
	//Search Account 
	private boolean SearchAcc(String acc_no)
	{
		if(acc_number.equals(acc_no))
		{
			return (true);
		}
		else
			return (false);
		
	}
	
	//To Deposit Funds
	void Deposit()
	{
		int a_deposit;
		System.out.println("Enter the amount to be deposited");
	}
	
	
	
}



//MAIN METHOD
public class Bank_CustomException {
	public static void main(String[] args) {
		Bank B=new Bank();
		Scanner sc=new Scanner(System.in);
		int choice;
		boolean customer=false;
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
			{
				System.out.println("Enter Account Number to deposit funds: ");
				
			}
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
