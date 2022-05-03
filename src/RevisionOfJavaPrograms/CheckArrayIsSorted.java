package RevisionOfJavaPrograms;

public class CheckArrayIsSorted 
{
	public static void main(String[] args) 
	{
		//check array is in ascending order or not
		
		boolean isSorted = true;
		int [] ar = {1,2,10,4,5};
		
		
		for(int i=0; i<ar.length-1; i++)
		{
			if (ar[i]>ar[i+1])
			{
				isSorted=false;
				break;
			}
		
		}
		if(isSorted)
		{
			System.out.println("The Array is Sorted");
		}
		else
		{
			System.out.println("The Array is not Sorted");
		}
		
		
		
	}

}
