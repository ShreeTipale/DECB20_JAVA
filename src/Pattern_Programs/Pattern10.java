package Pattern_Programs;

public class Pattern10 
{
	//      *
	//     **
	//    ***
	//   ****
	//  *****
	
	public static void main(String[] args) 
	{
		int space=4;
		int star=1;
		
		for(int i=1;i<=5;i++)
		{
			for(int s=1;s<=space;s++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=star;j++)
			{
				System.out.print("*");
			}
			
			System.out.println();
			space--;
			star++;
		}
		
			
		
		
	}

}
