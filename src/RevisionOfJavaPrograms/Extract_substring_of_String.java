package RevisionOfJavaPrograms;

public class Extract_substring_of_String
{
	public static void main(String[] args) 
	{
		//Write a java program to extract the first half of a string of even length
		//e.g Test Data: s1="Python"  output: Pyt
		
		String  str="Python";
		System.out.println(str.length());//6
		
		//printing first half of string
		String s1 = str.substring(0, str.length()/2);
		System.out.println(s1);
		
		//print last half of string
		String s2 = str.substring(str.length()/2, str.length());
		System.out.println(s2);
		
		//note-->in substring method parameter, first index includes and last index does not include
		//while printing output
		//Parameters:beginIndex - the beginning index, inclusive.endIndex - the ending index, exclusive
		
	}

}
