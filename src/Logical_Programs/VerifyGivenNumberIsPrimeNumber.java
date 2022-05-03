package Logical_Programs;

public class VerifyGivenNumberIsPrimeNumber 
{
	public static void main(String[] args) 
	{
		int num = 10;
		int count = 0;
		//prime no.is divisible by 1 and that no. only
		//so we will check it is divisible by remaining numbers which are greater than 1 & less than given no.
		
		for(int i=2;i<num;i++)
		{
			if(num%i==0)
			{
				count++;
				break;
				
			}
			
		}
		
		if(count==1)
		{
			System.out.println("The given no.is not a prime number");
		}
		else
		{
			System.out.println("The given no.is a prime number");
		}
		
	}

}
