package Methods2;

public class Sample2 
{
	//Non static regular method in diff class
	public static void main(String[] args) 
	{
		System.out.println("main method started");
		
		Sample3 s3=new Sample3();
		s3.m2();
		
		
		System.out.println("main method ended");
	}

}
