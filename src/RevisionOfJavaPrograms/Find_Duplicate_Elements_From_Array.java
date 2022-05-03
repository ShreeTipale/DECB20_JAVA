package RevisionOfJavaPrograms;

public class Find_Duplicate_Elements_From_Array 
{
	public static void main(String[] args) 
	{
		String [] ecom = {"Amazon","Flipkart","Myntra","Amazon","Ajio","Myntra","PaytmMall","Ajio"};
		
		System.out.println(ecom.length);//8
		
		System.out.println("----'brute force' method is used to find duplicate elements from array---");
		
		for(int i=0;i<ecom.length;i++)
		{
			for(int j=i+1;j<ecom.length;j++)
			{
				if(ecom[i].equals(ecom[j]))
				{
					System.out.println(ecom[i]);
				}
			}
		}
		
		
		
		
	}

}
