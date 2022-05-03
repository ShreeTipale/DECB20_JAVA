package RevisionOfJavaPrograms;

public class MaxNumberFromArray 
{
	public static void main(String[] args) 
	{
		int [] ar = {1,5,3,9,4,2,7};
		//find minimum value of "integer data type"
		//System.out.println(Integer.MIN_VALUE); //-2147483648
		//int max=Integer.MIN_VALUE;
		
		//or
		int max=0;
		
		for(int ele : ar)
		{
			//1st iteration: if 1>0 then it will become max so max =1 after 1st iteration and so on it changes...
			if(ele>max)
			{
				max=ele;
			}
		}
		System.out.println("The maximum element from given array: "+max);
		
	}

}
