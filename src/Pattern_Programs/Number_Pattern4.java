package Pattern_Programs;

public class Number_Pattern4 
{
	public static void main(String[] args) {
		
		//1
		//10
		//101
		//1010
		//10101
		
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				if(j%2==0)
				{
					System.out.print("0");
				}
				else
				{
					System.out.print("1");
				}
			}
			System.out.println();
		}
		
		
	}

}
