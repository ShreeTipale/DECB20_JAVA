package Array;

import java.util.Arrays;

public class example5
{
	public static void main(String[] args)
	{
		int ar[]=new int[5];
		ar[0]=30;
		ar[1]=40;
		ar[2]=50;
		ar[3]=20;
		ar[4]=10;
		
		System.out.println("---before sorting---");
		for(int i=0; i<=ar.length-1; i++)
		{
			System.out.println(ar[i]);
		}
		
		Arrays.sort(ar); //array will be sorted by ascending order of integer
		
		System.out.println("---print info in descending order---");
		
		for (int i=ar.length-1; i>=0; i--)
		{
			System.out.println(ar[i]);
		}
		
		
		
	}

}
