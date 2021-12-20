package nov29_21;
import java.util.*;
public class ReverseOfString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string: ");
		String str=sc.nextLine();
		String revstr="";
		char ch;
		for(int i=0;i<str.length();i++)
		{
			ch=str.charAt(i);
			revstr=ch+revstr;
		}
		System.out.println(revstr);
	}
	}


