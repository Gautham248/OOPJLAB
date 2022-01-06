package jan06_22;
import java.util.*;

class Bank{
	private String acc_holder,acc_number,acc_type;
	private long acc_balance;
	int num_of_cust=0;
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
		num_of_cust++;
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
	public boolean SearchAcc(String acc_no)
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
		long a_deposit;
		System.out.println("Enter the amount to be deposited :");
		a_deposit=sc.nextLong();
		
		try {
		if(a_deposit<=0)
		{
			throw new DepositException("Enter valid amount");
		}
		}
		catch(DepositException e)
		{
			System.out.println(e.getMessage());
		}
		
		acc_balance+=a_deposit;
		System.out.println("Current balance: "+acc_balance);
	}
	
	//To Withdraw Funds
	void Withdraw()
	{
		long a_withdraw;
		System.out.println("Enter the amount to be withdrawn :");
		a_withdraw=sc.nextLong();
			try {
				if(a_withdraw<=0)
				{
					throw new WithdrawException("Enter valid amount");
				}
			}
				catch(WithdrawException e)
				{
				System.out.println(e.getMessage());
				}
			
		if(a_withdraw>acc_balance)
		{
			System.out.println("Insufficient funds!!");
		}
		else
		{
		acc_balance-=a_withdraw;
			System.out.println("Current balnce: "+acc_balance);
		}
	}
	
}



public class UBS_GLOBAL {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter maximum number of customers");
		int mc=sc.nextInt();
		Bank []b=new Bank[mc];
		int noc=0,choice;
		System.out.println("--UBS GLOBAL WEALTH MANAGEMENT--\n");
		System.out.println("1.Create new account");
		System.out.println("2.Display all account details");
		System.out.println("3.Search by account ");
		System.out.println("4.Deposit");
		System.out.println("5.Withdraw");
		System.out.println("6.Exit");
		
		do
		{
			System.out.println("Enter your choice: ");
			choice=sc.nextInt();
			
			
		}while(choice!=6);
	}
	
}
