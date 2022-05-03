package Logical_Programs;

public class Reverse_Integer_Number_Without_String_Function 
{
	public static void main(String[] args) 
	{
		int num = 12345;
		int revNum= 0;
		int rem=0;
		
		while(num>0)
		{
			 rem = num % 10;//itr1: remainder = 5   itr2: remainder = 4
			
			revNum = (revNum*10)+rem; //0*10+5=5--->iter1:revNum = 5 itr2: revNum = 54
			
			num=num/10; //itr1:num= 12345/10=1234--->dividing integer value it doesn't give decimal point 
			            // itr2:num=1234/10 = 123 and so on decreasing value
		}
		
		System.out.println(revNum);
		
	}

}
