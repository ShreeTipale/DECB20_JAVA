package Pattern_Programs;

public class Pattern15 
{
	public static void main(String[] args) 
	{
		//*****
		// ****
		//  ***
		//   **
		//    *
		//   **
		//  ***
		// ****
		//*****
		
		int space=0;
		int star=5;
		
		//outer for loop for rows
		for(int i=1; i<=9; i++)
		{
			//inner for loop for space printing
			for(int j=1; j<=space; j++)
			{
				System.out.print(" ");
			}
			
			//inner for loop 2 for star printing
			for(int j=1; j<=star; j++)
			{
				System.out.print("*");
			}
			System.out.println();
			
			//if condition for first half 
			if(i<=4)
			{
				space++;
				star--;
			}
			//else condition for 2nd half
			else
			{
				space--;
				star++;
			}
				
		}
		
	}

}
