package Logical_Programs;

public class ReverseString2 
{
	public static void main(String[] args) {
		
		
		String s1 = "My name is abc";
		String [] ar = s1.split(" ");
		String s2="";
		
		for(int i=ar.length-1;i>=0;i--)
		{
			s2 = s2+ ar[i]+" ";
				
		}
		System.out.println(s2);//abc is name My 
		
		
	}

}
