package Logical_Programs;

public class Reverse_odd_index_String 
{
	public static void main(String[] args)
	{
		String str = "abc xyz pqr klm";
		String []ar = str.split(" ");
		
		for(int i=0;i<ar.length;i++)
		{
			if(i%2!=0)
			{
				String s1 = ar[i];
				ar[i] = reverseString(s1); //re-initialization of string for odd index
			}
			
		}
		
		//printing new re-initialized array
		for(int i=0;i<ar.length;i++)
		{
			System.out.print(ar[i]+" ");
		}
			
	}
	
	public static String reverseString(String obj)
	{
		String rev ="";
		for(int i=obj.length()-1;i>=0;i--)
		{
			rev = rev+obj.charAt(i);
		}
		return rev;
	}

}
