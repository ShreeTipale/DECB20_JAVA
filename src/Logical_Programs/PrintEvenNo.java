package Logical_Programs;

public class PrintEvenNo 
{
	public static void main(String[] args) 
	{
		//print even numbers from 1 to 50 in separate line
		
		for(int i=1; i<=100; i++)
		{
			if(i%2==0) //If remainder of i/2 is equal to zero then it is a even number
			{
				System.out.println(i);
			}
		}
		
	}

}
