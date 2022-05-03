package String_Class;

public class demo1 
{
	public static void main(String[] args) 
	{
		//These objects are going to be stored in #Constant pool area of String
		
		String s="abc";  //s & s1 will be in the same object due to same contents including their cases also
		String s1="abc";
		String s2="abc1";  // here s2 will have different object due to different content
	
	
	//These objects are going to be stored in non-constant pool area of String 
		
	String s3=new String("abc"); //s3 & s4 will have two different objects even though they have same contents.
	String s4=new String ("abc");
	
	
	//testing whether objects are same or different
	
	System.out.println(s==s1); //output is true
	System.out.println(s==s2);  //output is false
	System.out.println(s==s3);  //false
	System.out.println(s1==s2);  //false
	System.out.println(s3==s4);  //false
	
	
	}

}
