package RevisionOfJavaPrograms;

public class Addition_Of_1D_2D_Array 
{
	public static void main(String[] args) 
	{
		int [] a1 = {1,2,3};
		int [] a2 = {4,5,6};
		
		int [] result = {0,0,0};
		
		for(int i=0;i<a1.length;i++)
		{
			for(int j=0;j<a2.length;j++)
			{
				result[i] =  a1[i]+a2[i];
			}
			System.out.print(result[i]+" ");
		}
		
	}

}
