package Logical_Programs;

public class Palindrome_String 
{
	public static void main(String[] args) 
	{
		
		
		String s1 = "abcdcba";
		String rev = "";
		
		for(int i=s1.length()-1; i>=0; i--)
		{
			rev = rev+s1.charAt(i);
		}
		
		
		if(rev.equals(s1))//or (rev==s1)
		{
			System.out.println("The given String is a Pallindrome");
		}
		else
		{
			System.out.println("The given String is a Pallindrome");
		}
		
	}

}
