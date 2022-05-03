package RevisionOfJavaPrograms;

public class MultiplicationOf1D_Array 
{
	public static void main(String[] args) 
	{
		//Write a java program to multiply
		//Array1=[1,3,-5,4]
		//Array2=[1,4,-5,-2]
		
		int [] ar1= {1,3,-5,4};
		int [] ar2= {1,4,-5,-2};
		
		int [] result= {0,0,0,0};
		for(int i=0;i<ar1.length;i++) //for arr1
		{
			for(int j=0;j<ar2.length;j++) //for arr2
			{
				result[i]=ar1[i] * ar2[i];
				
			}
			System.out.print(result[i]+" ");
		}
		
	}

}
