package RevisionOfJavaPrograms;

public class ReverseString 
{
	public static void main(String[] args) 
	{
		String str= "piyush";
		
		//way1
		str.split(str);
		
		for(int i=str.length()-1;i>=0;i--)
		{
			System.out.print(str.charAt(i));
				
		}
		
		//way2
		System.out.println();
		String p = "";
		
		for(int i=str.length()-1;i>=0;i--)
		{
			p=p+str.charAt(i);
			
		}
		System.out.print(p);
		
		
		
		//Way3:using StringBuffer class
		System.out.println();
		StringBuffer sbr = new StringBuffer(str);
		System.out.println(sbr.reverse());
		
		
		
		
	}

}
