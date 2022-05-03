package Array;

import java.util.Arrays;

public class example4 
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
		
		Arrays.sort(ar);
		System.out.println("---after sorting---");
		
		for(int i=0; i<=ar.length-1; i++ )
		{
			System.out.println(ar[i]);
		}
		
		
	}

}
