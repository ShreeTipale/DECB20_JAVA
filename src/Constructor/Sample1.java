package Constructor;

public class Sample1 
{
	//globally declared variables
	int a;
	int b;
	int c;
	
	//User defined constructor----used to initialize the variable or object
	
	Sample1()   //---> this is user defined constructor without parameter //syntax:className()
	{
		a=20;
		b=40;
		c=a+b;
	}

	public static void main(String[] args)
	{
		System.out.println("main method started");
		Sample1 s1=new Sample1();   // called constructor in main method
		s1.test();
		
		System.out.println("main method ended");
		
	}
	
	public void test()
	{
		System.out.println("sum= "+c);
		System.out.println("running not static regular method");
	}
	
	
}
