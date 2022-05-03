package RevisionOfJavaPrograms;

public class AdditionOf2DArrays 
{
	public static void main(String[] args) 
	{
		int [][] ar1= {{1,2,3},{4,5,6}};
		System.out.println(ar1.length);//2--->ar1-row length
		System.out.println(ar1[0].length);//3-->ar1-0th column length
		int [][] ar2 = {{2,2,2},{3,3,3}};
		
		int [][]result= {{0,0,0},{0,0,0}};
		
		for(int i=0; i<ar1.length;i++)
		{
			for(int j=0;j<ar1[i].length;j++)
			{
				System.out.format("setting value for i=%d and j=%d\n", i,j);
				result[i][j]=ar1[i][j] * ar2[i][j];	
			}
			
		}
		//Printing the addition of 2-D Array
		for(int i=0; i<ar1.length;i++)
		{
			for(int j=0;j<ar1[i].length;j++)
			{
				result[i][j]=ar1[i][j] + ar2[i][j];
				System.out.print(result[i][j]+"  ");	
			}
			System.out.println();
		}
		
	}

}
