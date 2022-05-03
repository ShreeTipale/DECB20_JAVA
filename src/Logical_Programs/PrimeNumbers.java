package Logical_Programs;

public class PrimeNumbers 
{
	//2 is the lowest prime number
	//next prime no. is 3
	public static boolean isPrimeNumber(int num)
	{
		if(num<=1)
		{
			return false;
		}
		for(int i=2;i<num;i++)
		{
			if(num%i==0)
			{
				return false;
			}
		}
		return true;
		
		
	}
	
	
	//find the prime numbers between 1 to 20
	public static void getPrimeNumbers(int num)
	{
		for(int i=2;i<=num;i++)
		{
			if(isPrimeNumber(i))
			{
				System.out.println(i+" ");
			}
		}
		
	}
	
	public static void main(String[] args) 
	{
		
		//System.out.println("3 is a prime number: "+isPrimeNumber(3));
		//System.out.println("4 is a prime number: "+isPrimeNumber(4));
		
		getPrimeNumbers(20);
		
	}

}
