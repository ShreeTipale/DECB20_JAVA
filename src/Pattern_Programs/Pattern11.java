package Pattern_Programs;

public class Pattern11 
{
	//****
	// ***
	//  **
	//   *
	
	
	public static void main(String[] args) 
	{
		
		int space=0;
		int star=4;
		
		for(int i=1;i<=4;i++)
		{
			     //1<=0  false --->it will not print space in 1st line
			for(int s=1;s<=space;s++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=star;j++)
			{
				System.out.print("*");
			}
			System.out.println();
			space++;
			star--;
		}
		
	}

}
