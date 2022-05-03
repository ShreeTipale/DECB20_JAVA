package RevisionOfJavaPrograms;

public class ReverseString_using_StringBuffer
{
	public static void main(String[] args)
	{
		String s1= "Akash";
		//exp output=hsakA
		String rev ="";
		
		
		for(int i=s1.length()-1;i>=0;i--)
		{
			rev=rev+s1.charAt(i);
		}
		System.out.println(rev);
	
		System.out.println("---Reverse String by using StringBuffer Class---");
		StringBuffer s2= new StringBuffer(s1);
		
		StringBuffer revStr = s2.reverse();
		System.out.println(revStr);
		
	}

}
