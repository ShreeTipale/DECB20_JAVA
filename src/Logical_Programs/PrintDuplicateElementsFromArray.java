package Logical_Programs;

public class PrintDuplicateElementsFromArray
{
	static int [] ar = {1,2,3,4,5,4,7,8,3,7};
	
	public static void getDuplicateElementsFromArray(int ar [])
	{
		
		for(int i=0;i<ar.length;i++)
		{
			for(int j=i+1;j<ar.length;j++)
			{
				if(ar[i]==ar[j])
				{
					System.out.print(ar[i]+" ");
				}
			}
		}
		
	}
	
	
	public static void main(String[] args) 
	{
		getDuplicateElementsFromArray(ar);
		
	}

}
