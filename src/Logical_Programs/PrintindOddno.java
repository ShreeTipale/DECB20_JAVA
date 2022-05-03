package Logical_Programs;

public class PrintindOddno 
{
	public static void main(String[] args)
	{
		//print odd numbers from 0 to 10 in separate line
		for(int i=0; i<10; i++)
		{
			if(i%2!=0) //If remainder of i/2 is not equal to zero then it is a odd number
			{
				System.out.println(i);
			}
			//or for(int i=1; i<10; i++)
			// System.out.println(i);i=i+1;
		}
		
		
	}

}
