package RevisionOfJavaPrograms;

import java.util.Arrays;

public class RotateArray
{
	//Write a java program to rotate an array of integers in the left direction
	//Array=[20,30,40,50] Output=[50,40,30,20]
	
	public static void main(String[] args) 
	{
		int [] ar= {20,60,40,60};
	
		//Arrays.sort(ar);
		for(int i=ar.length-1; i>=0;i--)
		{
			System.out.print(ar[i]+" ");
		}
		
	}

}
