package Logical_Programs;

public class Armstrong_Number 
{
	//Armstrong Number: The sum of cube of each digit from the number is equal to that number then
	//that number is called as an Armstrong Number
	//ex.153= 1+125+27=153
	
	public static void isArmstrongNumber(int num)
	{
		int rem = 0;
		int cube =0;
		int t;
		t=num;
		
		while(num>0)
		{
			rem = num%10;
			cube = cube+(rem*rem*rem);
			num = num/10;
		}
		
		if(t==cube)
		{
			System.out.println(t+" is an Armstrong Number");
		}
		else
		{
			System.out.println(t+" is not an Armstrong Number");
		}
		
	}
	
	public static void main(String[] args) 
	{
		isArmstrongNumber(153);
		
	}

}
