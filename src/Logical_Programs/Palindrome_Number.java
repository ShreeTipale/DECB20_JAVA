package Logical_Programs;

public class Palindrome_Number 
{
	//palindrome Number-It is that number when the reversal of its digits give same number
	//ex.11,22,151,131,78987
	
	public static void isPalindomeNumber(int num)
	{
		System.out.println("The given number is: "+num);
		//ex 151
		int rem=0;
		int sum=0;
		int t;
		t=num;
		while(num>0)
		{
			rem = num%10; //get remainder=1
			sum = (sum*10)+rem;//(0*10)+1=1
			num=num/10;//151/10=15   integer do not take decimal value
		}
		if(t==sum)
		{
			System.out.println("Palindrome number");
		}
		else
		{
			System.out.println("Not a Palindrome number");
		}
	
	}
	
	public static void main(String[] args)
	{
		
		isPalindomeNumber(151);		
	}

}
