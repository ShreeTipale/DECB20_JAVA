package RevisionOfJavaPrograms;


public class concatenation_Of_Strings 
{
	public static void main(String[] args) 
	{
		//Write a java program to create the concatenation of two strings except removing 
		//the first character of each string
		//The length of the string must be 1 and above
		
		//Test data: str1="Python" str2="Tutorial"  Sample output="ythonutorial"
		
		String str1="Python";
		String str2="Tutorial";
		
		//str1=str1.substring(1);
		//str2 = str2.substring(1);
		
	//	String s1 = str1.concat(str2);
		//System.out.println(s1);
		
		//or way:2
		String s2= str1.substring(1).concat(str2.substring(1));
		System.out.println(s2);
		
		
	}

}
