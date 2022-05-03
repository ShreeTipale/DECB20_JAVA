package Constructor;

public class demo1 
{
	//variable initialization
	String StName;
	int StRollNo;
	
	demo1 ()   //user defined constructor  //used to initialize variable
	{
		StName="abc";  //variable declaration
		StRollNo=100;
System.out.println("running user defined constructor");
	}
		

	public void StudentInfo()
	{
		System.out.println(StName);
		System.out.println(StRollNo);
	}
	

}
