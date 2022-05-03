package Logical_Programs;

public class Reverse_Integer_Number 
{
	public static void main(String[] args) {
		
	
	int num = 112233;
	
	//First covert it into a String
	String s1= Integer.toString(num);
	//Create another empty String for storing reversed values
	String rev="";
	
	for(int i=s1.length()-1;i>=0;i--)
	{
		rev = rev+s1.charAt(i);
	}
	
	//again convert reversed String into integer 
	
	int revNum = Integer.parseInt(rev);
	System.out.println(revNum);
	
	
	
	}
	

}
