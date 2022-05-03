package RevisionOfJavaPrograms;

public class MinimunElementFromArray 
{
	public static void main(String[] args) 
	{
		int [] ar= {7,3,8,9,4,1,2};
		
		System.out.println(Integer.MAX_VALUE); //2147483647
		int min=Integer.MAX_VALUE;
	
		
		for(int ele:ar)	
		{
			if(ele<min)
			{
				min=ele;
			
			}
			 
		}
		System.out.println("The minimun value from given array is: "+min);
		
		
		
		
		
		
	}

}
