package nov29_21;

import java.util.*;
import java.util.Arrays;
public class SecondSmallestnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of elements in the array: ");
		int num=sc.nextInt();
		int[] intarr=new int[num];
		System.out.println("Enter the elements of the array: ");
		for(int i=0;i<num;i++)
		{
			intarr[i]=sc.nextInt();
	}
		Arrays.sort(intarr);
		System.out.println("The second smallest element in the array is: ");
		int ssmal=intarr[1];
		System.out.println(ssmal);
}
}