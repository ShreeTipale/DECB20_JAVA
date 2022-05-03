package Logical_Programs;

public class Verify_ArmstrongNumber 
{
	public static void main(String[] args)
	{
		//If the summation of cubes of each digits from the number is equal to that number then the
		//number is called as Armstrong number
		
		//ex.153=1^3 + 5^3 + 3^3 = 1+125+27 = 153
		
		
		int num = 153;
		int sum = 0;
		
		for(int i=num; i>0; i=i/10)
		{
			int rem = i%10;
			sum = sum + (rem*rem*rem);
		}
		
		if(num==sum)
		{
			System.out.println("The given number "+num+" is an Amstrong number");
		}
		else
		{
			System.out.println("The given number "+num+" is not an Amstrong number");
		}
		
	}

}
