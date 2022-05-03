package RevisionOfJavaPrograms;

public class replaceString 
{
	public static void main(String[] args) 
	{
		//Write a java program to create a new string taking first 3 characters from a given string.
		//if the length of given string is less than 3 use"#" as substitute characters.
		
		//Test data str1="a "  required output: "a##"
		
		
		String str="a ";
		String s1="";
		int length = str.length();
		if(length<3)
		{
			s1 = str.replace(" ", "##");
		}
		
		System.out.println(s1);
		
	}

}
