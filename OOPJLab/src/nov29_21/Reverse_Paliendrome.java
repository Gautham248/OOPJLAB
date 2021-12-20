package nov29_21;
import java.util.*;
public class Reverse_Paliendrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string:  ");
		String str=sc.nextLine();
		str=str.toLowerCase();
		String revstr="";
		char ch;
		for(int i=0;i<str.length();i++)
		{
			ch=str.charAt(i);
			revstr=ch+revstr;
		}
		System.out.println("Reverse of the string is:\n"+revstr);
		if(str.equals(revstr))
			System.out.println("The String is a Paliendrome");
		else
			System.out.println("The String is not a Paliendrome");
		

	}

}
