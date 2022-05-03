package String_Class;

public class String_Class_Methods 
{
	public static void main(String[] args) 
	{
		String s="velocity";  //content is in lower case
		String s1="VELOCITY";  //content is in UPPER CASE
		String s2="city1";
		String s3="";
		String s4="abcabab";
		String s5="abc xyz abc1 xyz1";
		
		
		//methods of String class
	
		//1.length()---->it will show the size of all characters
		//2.toLowerCase()---->converts upper case into lower case
		//3.toUpperCase()---->converts lower case into upper case
		//4.equals()---->checks whether content of strings are same or not(case sensitive)
		//5.equalsIgnoreCase()--->checks whether content of strings are same or not(ignoring its case)
		//6.contains()---->checks hidden part or word in whole content
		//7.isEmpty()--->checks whether string is empty or not
		//8.charAt()---->show the character at different index located (index value starts from 'o' here)
		//9.endsWith()
		//10.startsWith()
		//11.substring()
		//12.concat()
		//13.indexOf()
		//14.lastIndexOf()
		//15.replace()
		//16.split()
		
		
		System.out.println(s.length());  //output 8
		
		System.out.println(s.toUpperCase());  //output velocity---->VELOCITY
		
		System.out.println(s1.toLowerCase());  //VELOCITY---->velocity
		
		System.out.println(s.equals(s1));   //false--->(content same but case is different)
		
		System.out.println(s.equalsIgnoreCase(s1));  //true--->(same content without considering case)
		
		System.out.println(s.contains("city"));   //true--->(city is a part of velocity)
		
		System.out.println(s.contains("city1"));  //false--->(city1 isn't a part of velocity)
		
		System.out.println(s.isEmpty());  //false--->(string 's' is not empty.It contains some value)
		
		System.out.println(s3.isEmpty());  //true --->(string 's3' is empty)
		
		System.out.println(s.charAt(0));  //output is 'v' letter--->zeroth index character
		
		System.out.println(s.endsWith("ty"));  //true
		
		System.out.println(s.startsWith("ve"));  //true
		
		System.out.println(s.substring(3));   //ocity
		
		System.out.println(s.substring(2,7));  //locit
		
		System.out.println(s.concat(s1));   //velocityVELOCITY
		
		System.out.println(s4.indexOf('a'));  //0--->it will show index of 'a' which compiler gets first
		
		System.out.println(s4.lastIndexOf('a'));  //5---> it will show the index of 'a' which is at last in parameter
		
		System.out.println(s1.replace("CITY","city"));  //VELOcity
		
		System.out.println(s4.replace("ab","xy"));
		
		
		//split function
		   
		String [] ar=s5.split(" ");  //space between them removed {abc,xyz,abc1,xyz1}
		System.out.println(ar.length);  //4
		 //System.out.println(ar[0]);
		
		for(int i=0;i<=ar.length-1;i++)
		{
			System.out.print(ar[i]+" "); //abc xyz abc1 xyz1
		}
	}

}
