package Array;

public class example8 
{
	//index no
	  //0  1    //row & column
	
	//0 [11 21
	//1  31 41]
	
	
	public static void main(String[] args)
	{
		
		int ar[][]=new int[2][2];
		ar[0][0]=11;
		ar[0][1]=21;
		ar[1][0]=31;
		ar[1][1]=41;
		
		
		for (int i=0;i<=1;i++)
		{
			for(int j=0;j<=1;j++)
			{
				System.out.print(ar[i][j]+" ");
				
			}
			System.out.println();
			
		}
		
		
	}

}
