package Array;

public class example10 
{
	//11 12 13
	//14 15 16  //4*3 array
	//17 18 19
	//20 21 22
	
	public static void main(String[] args)
	{
		int ar[][]={{11,12,13},{14,15,16},{17,18,19},{20,21,22}};
		
		for(int i=0;i<=3;i++)
		{
			for(int j=0;j<=2;j++)
			{
				System.out.print(ar[i][j]+" ");
			}
			
			System.out.println();
		}
		
	}

}
