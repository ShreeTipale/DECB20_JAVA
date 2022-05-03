package RevisionOfJavaPrograms;

import java.util.Arrays;

public class Sort_Array_In_Ascending_descending 
{
	public static void main(String[] args) 
	{
		int [] p= {20,40,10,30,50};
		
		//sorting above array in ascending order
		Arrays.sort(p);
		System.out.println(p.length);//5
		
		//printing ascending order array
		for(int i=0;i<p.length;i++)
		{
			System.out.print(p[i]+" ");
		}
		
		//printing sorted array in descending order. 
		System.out.println();
		for(int i=p.length-1;i>=0;i--)
		{
			System.out.print(p[i]+" ");
		}
		
		
	}

}
