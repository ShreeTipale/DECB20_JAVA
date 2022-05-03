package RevisionOfJavaPrograms;

public class FindNumbersBet_1to100_divisibleBy
{
	//Write a java program to print the numbers between 1 to 100 which are divisible by 3,5 and by both.
	public static void main(String[] args)
	{
		//Numbers between 1 to 100 which are divisible by 3
		System.out.println("---Numbers between 1 to 100 which are divisible by 3---");
		
		for(int i=1; i<=100; i++)
		{
			//if the remainder of a number after dividing by 3 getting 0 then it is divisible by 3
			if(i%3==0)
			{
				System.out.println(i);
			}
			
			 
		}
		
		//Numbers between 1 to 100 which are divisible by 5
		System.out.println("---Numbers between 1 to 100 which are divisible by 5---");
		
		for(int i=1; i<=100; i++)
		{
			//if the remainder of a number after dividing by 5getting 0 then it is divisible by 5
			if(i%5==0)
			{
				System.out.println(i);
			}
		}
		
		//Numbers between 1 to 100 which are divisible by 3 and 5 both
		System.out.println("---Numbers between 1 to 100 which are divisible by 3 and 5 both---");
		
		for(int i=1; i<=100; i++)
		{
			if(i%3==0 && i%5==0)
			{
				System.out.println(i);
			}
		}
		
		
	}

}
