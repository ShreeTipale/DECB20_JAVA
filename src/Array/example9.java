package Array;

public class example9
{
	//5 15 25 35
	//4 14 24 34   //3*4 array   //i=row  j=column
	//2 12 22 32 
	
	public static void main(String[] args) 
	{
		int ar[][]={{5,15,25,35},{4,14,24,34},{2,12,22,32}};
		
		for(int i=0;i<=2;i++)
		{
			for(int j=0;j<=3;j++)
			{
				System.out.print(ar[i][j]+" ");
			}
			System.out.println();
		}
		
	}

}
