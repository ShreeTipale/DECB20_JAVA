package Logical_Programs;

public class Factorial_of_Number 
{
	public static void main(String[] args)
	{
		//factorial is calculated as: num=5--->(5*4*3*2*1) = 120
		
		int num = 5;
		
		int fact = 1;
		
		for(int i=num; i>=1; i--)
		{
			fact = fact*i;
		}
		
		System.out.println("factorial of "+num+" is: "+fact);
		
		
		
	}

}
