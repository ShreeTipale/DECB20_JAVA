package Logical_Programs;

public class DuplicateElementsFromArray {

	public static void main(String[] args) {
		
		int [] ar = {1,2,3,2,4,5,5,6,7,4,1};
		
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
}
