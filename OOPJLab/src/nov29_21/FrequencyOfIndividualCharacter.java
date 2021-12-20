package nov29_21;


import java.util.*;
import java.util.Arrays;

public class FrequencyOfIndividualCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the string: ");
		String str=sc.nextLine();
		str=str.toLowerCase();
		char[] str1=str.toCharArray();
		System.out.println("Enter the element to be searched");
		char key=sc.next().charAt(0);
		Arrays.sort(str1);
		int ind=Arrays.binarySearch(str1,key);
		int[] freq=new int[str.length()];
		for(int i=0;i<str.length();i++)
		{
			freq[i]=1;
			for(int j = i+1; j <str.length(); j++) 
            {  
                if(str1[i] == str1[j])
                {  
                    freq[i]++;  
                      
                    //Set str1[j] to 0 to avoid printing visited character  
                    str1[j] = '0';
                }
            }
		}
		System.out.println("the frequency of the given character is:");
		System.out.println(freq[ind]);
		
		//System.out.println("The Frequency of Characters are:");
		 //for(int i = 0; i <freq.length; i++) 
	       // {  
	         //   if(str1[i] != ' ' && str1[i] != '0')  
	           //     System.out.println(str1[i] + "--->" + freq[i]);  
	        //}  
	}

}
