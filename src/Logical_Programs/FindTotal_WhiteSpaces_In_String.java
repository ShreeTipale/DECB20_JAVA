package Logical_Programs;

public class FindTotal_WhiteSpaces_In_String 
{
	public static void main(String[] args) {
		
		
		String s1 = "ab   c d";
		int count=0;
		
		for(int i=0; i<s1.length(); i++)
		{
			char s2 = s1.charAt(i);
			if(s2 == ' ')
			{
				count++;
			}
		}
		
		System.out.println("Total no.of spaces in given string: "+count);
		
		
	}

}
