package nov29_21;
import java.util.*;
import java.util.Arrays;
public class FrequencyOfIndividualCharacter {
public static void main(String[] args) {
	    String str;
	    char ch;
	    int frequency=0;
	 Scanner scan=new Scanner(System.in);
	System.out.println("Enter the String  ");
	str=scan.nextLine();
	System.out.println("Enter the Character  ");
	ch=scan.nextLine().charAt(0);
	int i=0;
	do{
	if(ch==str.charAt(i)){ //check frequency of a character
	    frequency++;
	}
	 i++;
	}while(i<str.length());
	System.out.println("Frequency of "+ch+" = "+frequency);
	}//display frequency of the given character
}
