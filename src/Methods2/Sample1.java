package Methods2;

public class Sample1 
{
	//Non static regular method in a same class
	public static void main(String[] args)
	{
		
		System.out.println("main method started");
		
		Sample1 s1=new Sample1(); 
		s1.m1();
		
		
		
		
		System.out.println("main method ended");
	}


public void m1()
{
System.out.println("running non static regular method in same class");
		
}
}